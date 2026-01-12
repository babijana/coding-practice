abstract class A
{
    
    abstract public void show();
    abstract public void config();
    
}

public class imp20_anonymos
{
    public static void main(String args[])
    {
        A obj=new A() // here we creare a class for anonymos abstarct class
        {
            public void show() 
            {
                System.out.println("in new show");

            }
            public void config() 
            {
                System.out.println("in new config");

            }

        };
        obj.show();
        obj.config();
        
    }
}
