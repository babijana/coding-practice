//static means we create something as class member not onject member

class mobile
{
    String brand;
    int price;
    static String name;

    static //static block we can call its only once it will call when we call a object
    {
        name="phone";
    }

    public mobile()
    {
        brand="";
        price=200;
    }
    public void show()
    {
        System.out.print(brand +" :" + name);
    }
    public static void show1(mobile obj)
    {
        System.out.print( obj.brand +" :" + name);//we can't use non static variable on static method same time we can use static variable in non static method
    //we can use on static variable on static method if we pass the object 
    }




}




public class imp6_static
{
    public static void main(String args[])
    {
        mobile obj1=new mobile();
        obj1.brand="apple";
        obj1.name="Smart phone";
        mobile.price=1700;

        mobile obj2=new mobile();
        obj2.brand="samsung";
        obj2.name="Smart phone";
        mobile.price=1500;// we should use class name to call static variable

        obj2.show();
        mobile.show1(obj1)
    /* if we want to work with non static method we want to create an object but we can use static method without create objet 
    ,by call that method using class name
    



    }
}
// class loads and objects are instantrated



/* if i want all object have to have same name i can set the name variable as static ,
then if i change the value of name for one object it will change for all object*/
