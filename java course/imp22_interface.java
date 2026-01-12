/*abstract class A
{
     abstract public void show();
     abstract public void config();

}
*/
interface A
{
    int age=23;
    String name="jana"; // by default here variables are final and staticso we want to initialize this
    void show();
    void config();

}
interface X
{
    void run();

}

class B implements A,X/*this class should implement every abstract class in interface else we can 
define this as abstract class */
// one class can implements 2 or more interfaces

//class->class :extends
//class--> interface: implements
//interface--> interface: extends
{
    public void show() 
    {
        System.out.println("in new show");

    }
    public void config() 
    {
        System.out.println("in new config");

    }
    public void run() 
    {
        System.out.println("in new run");

    }
    
}
/* its like a class just have all the method by default abstract
interface just show us the design*/



class imp22_interface
{
    public static void main (String a[])
    {
        A obj =new B();
        obj.show();
        obj.config();

        X obj1 =new B(); // we want to create a object for interface X 
        obj1.run();

        System.out.println(A.name );
    }
}