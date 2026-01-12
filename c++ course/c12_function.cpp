#include<iostream>
using namespace std;

void wish(string name,int age)
{
    cout<<"happy birthday  "<<name<<'\n';
    cout<<"happy "<<age<< " birthday\n";
    cout<<"happy birthday\n";
}
int main()
{
    string name="jana";
    int age=23;
    wish(name,age);
    return 0;

}
// if i want to implement the wish function after the main function i want declare that before
//void wish();  like this