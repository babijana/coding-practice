public class imp31_throw
{
    public static void main(String args[])
    {
        int i=20;
        int j=0;
        
        try
        {
            j=18/i; 
            if (j==0)
            {
                throw new ArithmeticException("i dont want to print zero"); // we have to create an object to  ArithmeticException
                // catch will catch it
            }

        }
        catch(ArithmeticException e)
        {
            j=18/1;
            System.out.println("this is default value  "+e);
        }
        
        catch(Exception e)
        {
            System.out.print("something went wrong "+e);
        }
        System.out.println(j);
        System.out.print("hello");
    }
}