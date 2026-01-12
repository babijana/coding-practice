#include<iostream>
using namespace std;
int main()
{
    string array[5];
    int size=sizeof(array)/sizeof(array[0]);
    string temp;
    for (int i=0;i<size;i++)
    {
        cout<<"enterr your favourite foood if you want to quique enter q    ";
        getline(cin,temp);
        if (temp=="q")
        {
            break;
        }
        else{
            array[i]=temp;
        }
    }

    for (int j=0;j<size;j++)
    {
        cout<<array[j]<<"  ";
    }
}