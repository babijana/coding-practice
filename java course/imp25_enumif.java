enum Status
{
    Running,Failed,Pending,Success;
}


public class imp25_enumif
{
    public static void main (String args[])
    {
        Status s=Status.Running;

        switch(s)
        {
            case Running:
                    System.out.println("All good");
                    break;
                
            case Pending:
                    System.out.println("Please wait");
                    break;
                    
            case Failed:
                    System.out.println("Try again");
                    break;
            
            default:
                    System.out.println("Done");
                    break;
        

         }
    }
}
        
        /*if(s==Status.Running)
        {
            System.out.println("All good");
        }
        else if(s==Status.Pending)
        {
            System.out.println("Please wait");
        }
        else if(s==Status.Failed)
        {
            System.out.println("Try again");
        }
        else(s==Status.Success)
        {
            System.out.println("Done");
        } */


// we can't extend enum with any other class otherwise we can define methods constructors