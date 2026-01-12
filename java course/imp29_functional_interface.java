@FunctionalInterface
interface A
{
    int add(int i,int j); 
    
}

class imp29_functional_interface
{
    public static void main(String args[])
    {

        A obj= (i,j)->i+j;
        int result=obj.add(5,7);
        System.out.println(result);

    }
}