#include<iostream>
using namespace std;

int main()
{
    /*int *pnum=NULL;
    pnum=new int;
    *pnum=21;

    cout<<"address  "<<pnum<<'\n';
    cout<<"value  "<<*pnum;*/


    char *pgrades=NULL;
    int size;

    cout<<"enter the size of array";
    cin>>size;

    pgrades=new char[size];

    for (int i=0 ;i<size;i++)
    {
        cout<<"enter element  ";
        cin>>pgrades[i];
    }

    for (int i=0 ;i<size;i++)
    {
        cout<<pgrades[i]<<'\n';
        
    }
    delete[] pgrades;
    

}
