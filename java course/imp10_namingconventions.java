class A
{
    public A()
    {
        System.out.println("object created");
    }

    public void show()
    {
        System.out.println("in A show");
    }
}


    class imp10_namingconventions
{
    public static void main (String args[])
    {
        A obj= new A();// here obj is reference variable
        obj.show();

        /* A obj;
        obj=new A();  we can do this also

        new A(); this is object creation,this is snonymous object
        A obj= new A() this is reference object,we cant reuse this
        */

    }
}
//camel casing
//class and interface  - it should starts with capital letters
//variable and methods starts with small letters
// constant -it will all capitals
// showMyMarks()
 