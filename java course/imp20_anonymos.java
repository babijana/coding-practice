class A
{
    
    public void show()
    {
        System.out.println("in show");
    }
}

public class imp20_anonymos
{
    public static void main(String args[])
    {
        A obj=new A()
        {
            public void show()
            {
                System.out.println("in new  show");
            }

        };// this is annonymos class ,class for this create as imp20_anonymos$1.class
        obj.show();
    }
}
/* if we want to override a method many time we can create a new class extends A 
and overwrite this otherwise*/