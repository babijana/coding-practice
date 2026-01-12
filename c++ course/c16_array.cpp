#include<iostream>
using namespace std;

/*
void passing_array(string foods[],int size)
{
    for (int i=0;i<size;i++)
    {
        cout<<foods[i]<<'\n';
    }
    
}

int main()
{
    // arrays should be same data types
    string foods[3]={};// here we should mention array size
    foods[0]="hoppers";
    foods[1]="kottu";
    foods[2]="noodles";

    
    for (string i:foods)
    {
        cout<<i<<'\n';
    }
    foods[0]="stringhoppers";
    int size=sizeof(foods)/sizeof(foods[0]);
    passing_array( foods,size);
    

   
}
// consider sizeof() operator
*/


int main()
{
    string names[100];
    //fill(begin,end,value)
    fill(names,names+50,"jana");
    fill(names+50,names+100,"babi");

    for(string name:names)
    {
        cout<<name<<'\n';
}

}
// if i want insert same value in a array i can use fill

