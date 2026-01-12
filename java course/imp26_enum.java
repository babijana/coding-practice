enum Laptop
{
    Macbook(2000),XPS(2200),Surface,Thinkpad(1800);
    private int price;
    private Laptop()
    {
        this.price=500;
    }
    private Laptop(int price)
    {
        this.price=price;
    }
    public int getprice()
    {
        return price;
    }

    public void setprice(int price)
    {
        this.price=price;
        
    }
}


public class imp26_enum
{
    public static void main (String args[])
    {
        for (Laptop lap:Laptop.values())
        {
            System.out.println(lap+":"+lap.getprice());

        }
        
        
    
    
    
    }
}