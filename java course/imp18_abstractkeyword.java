abstract class Car  // we can use abstract method only in abstract class
{
    public abstract void drive(); //if we have a method and we don't know how to implement that we can declare that method instant of define that method
    public abstract void fly();  // if we wnat to declare a method we wanr to abstract it
    public void playmusic()
    {
        System.out.println("play music");
    }
}
// it is not compulsary abstract class should have abstract method
//we can have many abstract methods
abstract class WagonR extends Car// if we extends a class form another abstract class we should define that abstract method
{
    public abstract void fly();

    public void drive()
    {
        System.out.println(" driving");    
    }

}

class UpdatedWagonR extends WagonR // concreate class
{
    
    public void fly()
    {
        System.out.println(" flying");    
    }

}
    
public class imp18_abstractkeyword
{
    public static void main (String args[])
    {
        //car obj=new car();  : we can't create object of abstract class
        Car obj=new UpdatedWagonR();
        obj.drive();
        obj.fly();
        obj.playmusic();

    }
}