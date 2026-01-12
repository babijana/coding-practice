//insertion operator:cout<<" ";
//extraction operator:cin>>" ";
#include <iostream>
using namespace std;
int main()
{
    int age;
    string name;
    cout<<"whats your age";
    cin>>age;

    cout<<"whats your name";
    getline(cin>>ws,name);// note this

    cout<<"hello "<<name<<" you are  "<<age;
}

