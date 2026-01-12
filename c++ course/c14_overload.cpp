#include<iostream>
using namespace std;


void pizza()
{
    cout<<"here your pizza\n";
}
void pizza(string toping1)
{
    cout<<"here your toping1 pizza\n";
    
}
void pizza(string toping1,string toping2)
{
    cout<<"here your toping1,toping2 pizza";
}
int main()
{
   
    string toping1="onion";
    string toping2="chicken";

    pizza();
    pizza(toping1);
    pizza(toping1,toping2);

}
