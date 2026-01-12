enum Status
{
    Running,Failed,Pending,Success;//teseare constants
}


public class imp24_enum
{
    public static void main (String args[])
    {
        Status s=Status.Running;
        System.out.println(s);
        System.out.println(s.ordinal()); // it will print the index
        
        Status[] ss=Status.values();
        for (Status st:ss)
        {
            System.out.println(st +":"+st.ordinal());
        }
    
    
    
    }
}