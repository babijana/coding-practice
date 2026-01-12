#include<iostream>
using namespace std;

namespace one
{
    int x=1;

}
namespace two
{
    int x=2;
}
int main()
{
    using namespace one;
    cout<< x<<endl;
    cout<<two::x; // we can use this 2 types 
    return 0;

}
/* typedef vector<<pair<<string,int>>pairlist;
typedef string text_t;
text_t a="hello"  : i can use text_t for string like this i can assign for int also
*/
/*
using text_t=string;   :i can use this also
*/