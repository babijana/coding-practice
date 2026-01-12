#include<iostream>
using namespace std;

int add(int num1,int num2)
{
    return (num1+num2);
}

int main()
{
    int num1=9;
    int num2=5;
    int result=add(num1,num2);

    cout<<result;


    return 0;
}