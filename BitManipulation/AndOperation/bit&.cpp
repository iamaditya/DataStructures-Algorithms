#include <bits/stdc++.h>

using namespace std;

#define fo(i,n) for(int i=0;i<n;i++)

void solve()
{
    int n = 1;
    cin>>n;
    int arr[n];
    int b;
    cin>>b;
    int ans =n & b; // converting numbers into binary then doing and operation

    /*

    example: 
    n = 8 and b = 11;
    8 in binary is : 1000
    11 in binary is: 1011
    so ans = 8 & 11;
    1 0 0 0 
    1 0 1 1 
    1 0 0 0  <= converting this no into decimal : 8 

    so ans is : 

    */
    cout<<ans<<endl;
}

int main()
{
    
    int t = 1;
    // cin>>t;
    while(t--){
        solve();
    }
    return 0;
}