#include<iostream>
using namespace std;

int main()
{
    // memory adress is a location in memory where data is stored
    //a memory address can accessed with &(address of operators)

    string name ="babijana";
    int age =23;
    bool student=true;

    cout<<& name<<'\n';
    cout<<& age<<'\n';
    cout<<& student<<'\n';
}