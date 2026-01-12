class Calculator
{
    public int add(int num1,int num2)
    {
        return num1+num2;
    }
    public int add(int num1,int num2,int num3)
    {
        return num1+ num2+ num3;
    }
    public double add(double num1,int num2)
    {
        return num1+num2;
    }

// more than one methods has same name acording tothe input and type result will be produce
}


public class imp2_object2
{
    public static void main(String args[])
    {
        
        Calculator obj=new Calculator();
        double result=obj.add(3.2,6);
        System.out.print(result);

    }
}