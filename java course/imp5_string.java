public class imp5_string
{
    public static void main(String args[])
    {
        /*

        String name= new String("naveen");
        System.out.println("hello  "+ name);
        System.out.println(name.charAt(1));    :it print the character which have index 1
        System.out.println(name.concat("  reddy"));   :we can concate like this or using "+"operator
        name="naven";
        name=name+"reddy";  : here address will change  and navin for garbage collection
        

        name s1=name("navin") it means not we have two objects it means we have two reference
        name s2=name("navin") 

         */


        /*  String buffer*/
        StringBuffer sb=new StringBuffer("naven"); // it use to mutable strings
        System.out.println(sb.capacity()); //it will give 21 because string buffer give 16 space extra every time
        //lenth  and capcity are different
        sb.append(" reddy");
        System.out.print(sb);
        sb.setLength(30);//we can set the legth other placeswill be null
        sb.ensureCapacity(100);//we can set minimum capacity
        sb.delete(1,2);// we can delete a part of the string using this
        sb.deleteCharAt(1);// we can delete a character in a index
        sb.insert(0,"java")//we can insert ,here we want to pass the index and strig that want to insert
        String str=sb.toString(); // using toString we can store the data in stringbuffer to string
    //difference between stringbuffer and stringbuilder is stringbuffer is thred safe otherwise its two are same

    }
}