#include<iostream>
using namespace std;

int num=5;// global variable
void hi()
{
    int num=2;// local variable
    cout<< "my hi  number "<< num;

}
int main()
{
    cout<< "my number "<< num<<'\n';
    hi();
}

