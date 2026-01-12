#include<iostream>
using namespace std;
int main()
{
    int marks;
    cout<<"enter your marks";
    cin>>marks;

    if(marks>90)
    {
        cout<< "verygood";
    }
    else if(marks>75)
    {
        cout<<"good";
    }
    else if(marks>50)
    { 
        cout<<"average";
    }
    else
    {
        cout<<"not good";
    }
    return 0;

}

//we can implement if else like this
//condition ? out if it's true: out if it's false;
//marks>=50 ? cout<<"you pass":cout<<"you fail";
//cout<<(marks>=50 ? "you pass": "you fail");
// && and
// != not equal
// == equal
// || or