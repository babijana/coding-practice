class human
{
    private int age;// this variable only access in the same class
    private String name;

    /*public void setage(int a)
    {
        age=a;
    }
    */

    public void setage(int age)
    {
        this.age=age;    //here this reprecents current object so we cane use same name for instant variable and local variable
    }
    public void setname(String name)
    {
        this.name=name;
    }


    public void setname(String n)
    {
        name=n;
    }

    public int getage()// here we enchaptulate data and methods that is enchaptulation
    {
        return age;// we call this methods name as getters and setters
    }
    public String getname()
    {
        return name;
    }
}


public class imp7_encaptulation
{
    public static void main (String args[])
    {
        human obj=new human();
        obj.setage(11);
        obj.setname("navin");
        System.out.println(obj.getname()+":"+obj.getage());

    }
}