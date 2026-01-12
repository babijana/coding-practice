#include<iostream>
using namespace std;

int main()
{
    int types[][3]={{1,2,3},{4,5,6},{7,8,9}};

    for(auto & num:types)
    {
        for(int n: num)
        {
            cout<<n<<" ";
        }
        cout<<endl;
    }


}