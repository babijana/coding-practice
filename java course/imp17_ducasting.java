class A
{
    public void show1()
    {
        System.out.println(:in A show);

    }


}

class B extends A
{
    public void show2()
    {
        System.out.println(:in B show);
    }

}

public class imp17_ducasting
{
    public static void main (String args[])
    {
        /*double d=4.5;
        int i=(int)d;
        System.out.println(i);   casting */

        A obj =(A)new B();//up casting 
        obj.show1();
        
        
        B obj1 = (B)obj; //down  casting 
        obj.show2();


    }
}