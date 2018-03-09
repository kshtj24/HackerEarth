//Solution copied from editorial

#include <bits/stdc++.h>
using namespace std;
#define ll long long

#define gc getchar_unlocked

void scanint(ll &x)
{
    register int c = gc();
    x = 0;
    for(;(c<48 || c>57);c = gc());
    for(;c>47 && c<58;c = gc())   
        {x = (x<<1) + (x<<3) + c - 48;}
}
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        ll n;
        cin>>n;
        ll a[n];
        ll sum=0,flag=0;
        for(int i=0;i<n;i++)
        {
            cin>>a[i];
            if(a[i]<=0)
            sum+=a[i];
            if(a[i]>0)
            flag=1;
        }
        if(flag==0)
        {
            cout<<sum<<endl;
        }
        else
        {
            sort(a,a+n);
            ll sum1=0,f=0,ans,k=0;
            int i;
            for(i=n-1;i>=0&&f==0;i--)
            {
                if(a[i]>=0)
                {
                    sum1+=a[i];
                    k++;
                }
                else
                {
                    f=1;
                }
            }
            ans=sum1*(k)+sum;
            if(f==1)
            {
                i+=1;
                for(int j=i;j>=0;j--)
                {
                    sum1+=a[j];
                    sum-=a[j];
                    k++;
                    ll tmp=(sum1*k)+sum;
                    ans=max(ans,tmp);
                }
            }
            cout<<ans<<endl;
        }
    }
    return 0;
}