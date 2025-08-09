package wipro.Sun1.com;
import java.util.*;
public class ArrayDemo 
{
public static void main(String[] args) 
{
Scanner ob=new Scanner(System.in);
System.out.println("enter 5 nos");
int a[]=new int[5];
for(int i=0;i<5;i++)
	a[i]=ob.nextInt();

System.out.println("the 5 nos are");
for(int i=0;i<5;i++)
	System.out.println(a[i]);
}
}