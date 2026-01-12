
/*class A extends Object  // every class in java is extend of class Object
//but we dont want to mention this
{
    public A()
    {
        super();
        System.out.println("in A");
    }
    public A(int a)
    {
        super();
        System.out.println("in A int");
    }
    
}
class B extends A
{
    public B()
    {
        super();
        System.out.println("in B");
    }
    public B(int b)
    {
        super();//every constructor have super even it is don't mention
        //this means call the constructor of super class
        //if me pass a parameter in super which is in b it will call paremeterizen constructor A
        System.out.println("in B int ");
    }

   
}


class thisandsuper
{
    public static void main (String args[])
    {
        B obj=new B(5);
    }
}
*/


class A extends Object  
{
    public A()
    {
        super();
        System.out.println("in A");
    }
    public A(int a)
    {
        super();
        System.out.println("in A int");
    }
    
}
class B extends A
{
    public B()
    {
        super();
        System.out.println("in B");
    }
    public B(int b)
    {
        this();// it will execute constructor of same class
        System.out.println("in B int ");
    }

   
}


class thisandsuper
{
    public static void main (String args[])
    {
        B obj=new B(5);
    }
}