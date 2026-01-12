class Calculator
{
    int a;//we can add variables and methods in class
    public int add(int n1,int n2)//we want to add return type(int)
    {
        int re=n1 + n2;
        return re;
    }
}
    
    
public class imp1_object
{
    public static void main (String args[])
    {
        int num1=5;
        int num2=7;

        Calculator calc=new Calculator();// this is how we create an object
        int result= calc.add(num1,num2);// this is how we call another class and pass the values
        System.out.print(result);



    }
}