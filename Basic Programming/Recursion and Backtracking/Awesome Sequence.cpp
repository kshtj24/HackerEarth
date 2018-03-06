#include <iostream>
#include <vector>
typedef long long int ll;
using namespace std;
ll mod=1000000007;
ll k, q, m, i;
vector<long long> a;
 
ll rec(ll n){
 ll p=1;
 if(n==0) return 1;
 while(p<=n){
  p*=2;
 }
 return (a[n%k]%mod+rec(n-p/2)%mod)%mod;
}
 
int main()
{
 cin>>k;
 for(i=0;i<k;i++){
  cin>>m;
  a.push_back(m);
 }
 
 cin>>q;
 for(i=0;i<q;i++){
  cin>>m;
  cout<<rec(m)<<"\n";
 }
 return 0;
}