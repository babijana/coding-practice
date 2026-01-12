#include<iostream>
using namespace std;


void swap(string &x,string &y)
{
    string temp;
    temp=x;
    x=y;
    y=temp;
    

}

int main()
{
    string x="babijana";
    string y="jegarashan";
    
    swap(x,y);
    cout<<x<<" "<<y;
    // when we pass the values by parameters we copy the elements
    // so in swap function we pass by reference
    return 0;
    
}
