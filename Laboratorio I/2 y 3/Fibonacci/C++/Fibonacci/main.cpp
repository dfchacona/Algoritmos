#include <iostream>
using namespace std;
int main() {

    int a,b,n, res;
    cin>>n;
    a = 0;
    b=1;
    cout<<a<<endl;
    cout<<b<<endl;
    for (int i=2; i<n; i++){
        res=a+b;
        a=b;
        b=res;
        cout<<(res)<<endl;
    }


    return 0;
}