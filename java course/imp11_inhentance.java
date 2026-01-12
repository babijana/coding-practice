// in inhentance we can copy the features from upper class
// here we have parent or super or base class,child or sub or drive class

public class imp11_inhentance 
{
    public static void main(String args[])
    {
        imp11_advancecalc obj=new imp11_advancecalc();
        int r1=obj.add(4,5);
        int r2=obj.sub(7,3);
        int r3=obj.multi(4,5);
        int r4=obj.div(15,3);
        System.out.print(r1+" "+r2+" "+r3+" "+r4);


    }
}
// single level inhantance  calc,advcalc
// double level inhantance  calc,advcalc,veryadvcal
// java does not support multiple inhentance