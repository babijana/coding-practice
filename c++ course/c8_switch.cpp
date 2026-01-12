#include<iostream>
using namespace std;

int main()
{
    char op;
    cout<< "enter the operator";
    cin>> op;
    double num1;
    double num2;
    cout<< "enter num1";
    cin>> num1;
    cout<< "enter num2";
    cin>> num2;



    switch(op)
    {
        case '+':
        cout<<num1+num2;
        break;
        case '-':
        cout<<num1-num2;
        break;
        case '*':
        cout<<num1*num2;
        break;
        case '/':
        cout<<num1/num2;
        break;
        default:
        cout<< "no valueable operator";
        break;



    }
}
