class A
{
    public void showTheDAtaBelongsThisClass()
    {
        System.out.println("in A");
    }
}
class B extends A
{
    @override    //we can use this for debugging process compiler tell us whats the problem
    public void showTheDAtaBelongsThisClass()
    {
        System.out.println("in B");
    }

}

public class imp27_anotation
{
    public static void main(String args[])
    {
        B obj=new B();
        obj.showTheDAtaBelongsThisClass();       
    }
}