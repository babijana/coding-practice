class Student
{
    int rollnum;
    String name;
    int marks;

}

class imp4_stringarray
{
    public static void main(String args[])
    {
        Student s1=new Student();
        s1.rollnum=1;
        s1.name="mathu";
        s1.marks=88;

        Student s2=new Student();
        s2.rollnum=2;
        s2.name="sathu";
        s2.marks=95;
        Student s3=new Student();
        s3.rollnum=3;
        s3.name="jathu";
        s3.marks=98;

        Student student[]=new Student[3];// here type is student
        student[0]=s1;
        student[1]=s2;
        student[2]=s3;

        for(Student stdu:student)
        {
            System.out.println(stdu.name+" :"+stdu.marks);
        }
        System.



    }
}