#include<bits/stdc++.h>
    #include<iostream>
    using namespace std;
    #define fre  freopen("in.txt","r",stdin);freopen("0.out","w",stdout)
    #define abs(x) ((x)>0?(x):-(x))
    #define MOD 1000000007
    #define LL signed long long int
    #define scan(x) scanf("%d",&x)
    #define print(x) printf("%d\n",x)
    #define scanll(x) scanf("%lld",&x)
    #define printll(x) printf("%lld\n",x)
    #define rep(i,from,to) for(int i=(from);i <= (to); ++i)
    #define pii pair<int,int>
    LL pow(LL base, LL exponent,LL modulus = MOD){
     LL result = 1;
     while (exponent > 0)
     {
         if (exponent % 2 == 1)
             result = (result * base) % modulus;
         exponent = exponent >> 1;
         base = (base * base) % modulus;
     }
     return result;
    }
    LL func(LL x,LL n, LL len){
        LL r = pow(2,len,MOD);
        LL temp = (pow(r, n, MOD)-1) * pow(r-1, MOD-2, MOD) % MOD;
        temp = temp * x % MOD;
        return temp;
    }
    pair<LL,LL> gcd(int a,int b){
        if(a%b==0){
            return {pow(2,a-1,MOD), pow(2,b-1,MOD)};
        }
        else{
            pair<LL,LL> x = gcd(b, a%b);
            return {(func(x.first,a/b,b) * pow(2,a%b,MOD) + x.second) % MOD, x.first};
        }
    }
    int main(){
        int T;
        cin>>T;
        while(T--){
            int x,y;
            cin>>x>>y;
            cout<<gcd(x,y).first<<endl;
        }
    }