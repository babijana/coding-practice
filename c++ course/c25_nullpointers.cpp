#include<iostream>
using namespace std;
int main()
{
    //null value= a special value that means somethig has no value when a pointer is holding a null value
    //nullptr=keyword represent null pointer_to_binary_function
    //null pointers helpfull when determining if an address was sucessfully assigned to a pointer

    int *pointer=nullptr;
    int num=5;
    pointer=&num ;

    if(pointer==nullptr)
    {
        cout<<"address was not assigned";
    }
    else
    {
        cout<<"address was assigned";

    }


}


