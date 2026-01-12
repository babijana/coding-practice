#include <iostream>
using namespace std;
// const keyword specify that variable value is constant we cant modify , it's only for read
int main()
{
    const double pi=3.14159;// here we set pi as constant
    int radious=5;
    double circumferrence=2*pi*radious;
    cout<< circumferrence<<'\n';

}