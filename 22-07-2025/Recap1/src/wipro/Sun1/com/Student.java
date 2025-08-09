package wipro.Sun1.com;

import java.util.Scanner;

public class Student 
{
	int rollno;
	String name,address;
	float phy ,chem, maths, total, avg;
	
	
	public Student() {
		//default constructor
		System.out.println("default constructor");
	}
	public Student(int rollno, String name, String address, float phy, float chem, float maths, float total,
			float avg) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
		this.phy = phy;
		this.chem = chem;
		this.maths = maths;
		this.total = total;
		this.avg = avg;
		System.out.println(rollno+" "+name+"  "+address+ "  "+total+"  "+avg);
	}
	void input()
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("enter rollno,name,address");
		rollno=ob.nextInt();
		name=ob.next();
		address=ob.next();
		System.out.println("enter physics,chemistry,maths marks");
		phy=ob.nextFloat();
		chem=ob.nextFloat();
		maths=ob.nextFloat();
		total=phy+chem+maths;
		avg=total/3;
	}
	void display()
	{
		System.out.println("rollno is "+rollno+"Name is "+name);
		System.out.println("the address is "+address);
		System.out.println("The total is "+total);
		System.out.println("The average is "+avg);
	}
	int sum(int a,int b)
	{
		return a+b;
	}
	float sum(float a,float b)
	{
		return a+b;
	}
public static void main(String[] args) 
{
	Student ob1=new Student();
	Student ob2=new Student();
	Student ob3=new Student(103,"peter","Bangalore",66,77,88,231,77);
	ob1.input();
	ob1.display();
	System.out.println(ob1.total);
	System.out.println("the sum is "+ob1.sum(5, 6));//method overloading//compile time
	System.out.println("the sum is "+ob1.sum(5.4f, 6.4f));
}
}