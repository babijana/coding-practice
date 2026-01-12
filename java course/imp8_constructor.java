class human
{
    int age;
    String name;

    /* a costructor look like a method itself
       only here we do not mention return type but its name should be class name
       we dont want to call costructor every time we create object 
       it will call costructor,A constructor in Java is a special method used to initialize objects. */

    /*public human()//default constructor
    {
        name="jana";
        age=23;
    }*/

    public human(int a,String n)//parameterized constructor
    {
        name=n;
        age=a;
    }

    public void setname(String name)
    {
        this.name=name;
    }
    public void setage(int age)
    {
        this.age=age;
    }
    public String getname()
    {
        return name;
    }
    public int getage()
    {
        return age;
    }




}




class imp8_constructor
{
    public static void main(String args[])
    {
       // human obj=new human();
        human obj1=new human(18,"naven");

        
        System.out.print(obj1.getname()+":"+obj1.getage());
        

    }
}

//method over loading: we have 2 methods with same name and different parameter