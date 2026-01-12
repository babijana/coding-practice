#include<iostream>
using namespace std;
int main()
{
    // pointers-variable that stores a memory address of another variable
    //sometimes ist easier to work with memory address
    // & address of operators
    //*difference operators
    string name="jana";
    int age=23;
    string pizza[2]={"piza1","piza2"};


    string *pName=&name ; // pointers shouldbe same data types
    int *pAge=&age;
    string *pPizza= pizza;// for array

    cout<<pName<<endl;   // this contain address
    cout<<*pName<<'\n';  //this contain value
    cout<<*pAge<<'\n';
    cout<<*pPizza; // it will give the1st element in array

}