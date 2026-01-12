
//final: variable,method,class
final class Calc // when we made class as final no other class can't extends this
{
    final public void show() //when we made final method  we can't overridding this method
    {
         System.out.println("in calc show");

    }

    public void  add(int n1,int n2)
    {
        System.out.println(a+b);

    }
}



public class imp15_final
{
    public static void min(String args[])
    {
        Calc obj =new Calc();
        obj.show();
        obj.add(5,8);


        /*final int num =4; // once assigned the value we can't change it
        System.out.println(num); */

    }
    
}