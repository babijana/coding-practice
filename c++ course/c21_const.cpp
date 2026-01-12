#include<iostream>
using namespace std;

void print(const string name,const int age)
{
    cout<<name<<endl;// we cant change the values of const
    cout<<age<<endl;

}
int main()
{
    string name="babi";
    int age=23;
    print(name,age);

}
