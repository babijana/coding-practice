class janaException extends Exception
{
    // we have to send a msg also so we want to create a constructor
    public janaException(String string)
    {
        super(string);
    }
}



public class  imp32_exceptin
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
                throw new janaException("i dont want to print zero"); 
            }

        }
        catch(janaException e)
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