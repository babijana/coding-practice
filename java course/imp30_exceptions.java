// Errors
//compile time error
// run ime error
//logical error
public class imp30_exceptions
{
    public static void main(String args[])
    {
        int i=2;
        int j=0;
        int nums[]=new int[3];
        String str =null;
        try
        {
            j=18/i; // if a line in try block call exception remaining code in try block  will not execute
            System.out.println(str.length());
            System.out.println(nums[5]);

        }
        catch(ArithmeticException e)
        {
            System.out.print("can not devide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.print("stay in range");
        }

        catch(Exception e)
        {
            System.out.print("something went wrong "+e);
        }
        // if we have catch(Exception e) this catch block it shoult at last else everyhig will handle by Exception
        System.out.println(i);
        System.out.print("hello");
    }
}

/*if we use try catch block if eny exceptions ocurs thats not problem
 thar catch block will excecure and remining codes will executes but if 
 we didn't do that it cause exceptions*/