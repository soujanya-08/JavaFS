package wipro.Sun1.com;
public class StaticDemo 
{
static int rollno=10;
static String name="trupti";
static String address="orissa";
static void display()//we cannot access non-static methods and variables in a static method
{
	System.out.println(rollno+ " "+name+"  "+address);
}
static
{
	System.out.println("This is a static block");
}
public static void main(String[] args)
{
System.out.println("rollno is "+rollno);	
System.out.println("the name is "+StaticDemo.name);
System.out.println("the address is"+StaticDemo.address);
display();
StaticDemo.display();
}}