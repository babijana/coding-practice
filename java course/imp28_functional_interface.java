@FunctionalInterface
interface A
{
    void show(int i); // functional interface only have one method
    // it also call SAM(simple abstract interface)
}

 /*B implements A
 {
    public void show()
    {
        System.out.println("in B");
    }
 }
 */

class imp28_functional_interface
{
    public static void main(String args[])
    {
        /*A obj=new A() 
        {
            public void show()
            {
                System.out.println("in B");
            }
        
        };*/

        A obj= i->System.out.println("in B");
        obj.show(5);
       

    }
}


//lambda expression only works with funtional interface


// marker interface :blank interface
// fot to update somethig for compiler