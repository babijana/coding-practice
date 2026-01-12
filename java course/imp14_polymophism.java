/*polymophism   => it is same thing and  have different behaviours
run time polimophism and compile time polimophism
overloading complie time...
overridding runtime...
*/
class A
{
    public void show()
    {
        System.out.println("in A show");
    }

}
class B extends A
{
     public void  show()
    {
        System.out.println("in B show");
    }

}

class C extends A
{
     public void  show()
    {
        System.out.println("in C show");
    }

}


public class imp14_polymophism
{
    public static void main(String args[])
    {

        //A obj=new B();  type of obj is A and its implement B
        //obj.show();

        A obj=new A();
        obj.show();

        obj=new B();
        obj.show();

        obj=new C();
        obj.show();

// this method calls dynamic methods distpatch

    }
}

