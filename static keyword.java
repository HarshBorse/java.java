class Student
{
int roll_no;
String name;
static String College_Name="RCPIMRD";
}
class StaticDemo
{
public static void main(String args[])
{
Student s1=new Student();
s1.roll_no=100;
s1.name="abcd";
System.out.println(s1.roll_no);
System.out.println(s1.name);
System.out.println(Student.College_Name); 
Student  s2=new  Student();
s2.roll_no=200;
s2.name="zyx";
System.out.println(s2.roll_no);
System.out.println(s2.name);
System.out.println(Student.College_Name); 
}
}
