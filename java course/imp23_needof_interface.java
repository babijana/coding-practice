interface Computer
{
    public void code();
    
    
}

class laptop implements Computer
{
    public void code()
    {
        System.out.println("in laptop");
    }
    

}

class desktop implements Computer
{
    public void code()
    {
        System.out.println("in desktop");
    }
}

class Developer
{
    public void dev(Computer lap)
    {
        lap.code();

    }
}


public class imp23_needof_interface
{
    public static void main(String args[])
    {
        Computer lap=new laptop();
        Computer desk=new desktop();

        Developer obj= new Developer();
        obj.dev(desk);

        


    }
}