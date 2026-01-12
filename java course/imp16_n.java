class laptop
{
    String model;
    int price;

    
    public String toString()
    {
        return (model +" : " + price);
    }

    public boolean equals(laptop that)
    {
        if (this.model.equals(that.model) && this.price==that.price)
        {
            return true;
        }
        else
        {
            return false;
        }


    }

}

public class imp16_n
{
    public static void main (String args[])
    {
        laptop obj1=new laptop();
        obj1.model="Lenovo Yoga";
        obj1.price=1000;

        laptop obj2=new laptop();
        obj2.model="Lenovo Yoga";
        obj2.price=1000;

        //System.out.println(obj.toString()) :if we try to print obj automatically its call obj.toString()
        //it will give you object name and hashcode 

        boolean result=obj1.equals(obj2);

        System.out.println(result);



    }
}