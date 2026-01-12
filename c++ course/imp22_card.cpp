#include<iostream>
using namespace std;
int addodd(string pin)
{
    int sum=0;
    for(int i=0;i<=pin.size()-1,i++)
    {
        sum+=i;
    }
    return sum;


}




int main()
{
    string pin;
    cout<< "enter your pin number";
    cin>> pin;
    int result=addodd(pin);


}

