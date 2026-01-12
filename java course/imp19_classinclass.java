class A
{
    int age;
    public void show()
    {
        System.out.println("in show");
    }
    static class B  
    {
        public void config()  
        {
            System.out.println("in config");
        }
    }
    /*class B  //class save as A$B.class
    {
        public void config()  
        {
            System.out.println("in config");
        }
    }*/
   //we cant create outter class as static only inner class can
}

public class imp19_classinclass
{
    public static void main(String rags[])
    {
        A obj1= new A();
        obj1.show();

       /* A.B obj2= obj1.new B(); // this is the way to create class claas that in a class 
        obj2.config();*/

        A.B obj2= new A.B(); // this  way works only if the class is static
        obj2.config();
        



    }
}