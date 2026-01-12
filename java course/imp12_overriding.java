 class  Calc
 {
    public int add(int n1,int n2)
    {
        return(n1+n2);
    }


 }
 class advcalc extends Calc
 {
    /*public int add(int n1,int n2)   // this method is over ridingof above add
    {
        return(n1+n2+1);
    }*/
 }
// in overriding we have same name and same parameter but different methods

class imp12_overriding
{
    public static void main (String args[]) 
    {
        advcalc obj=new advcalc();
        int r1=obj.add(5,2);
        System.out.print(r1);


    }
}