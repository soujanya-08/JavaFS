package wipro.Sun1.com;
public class Salary extends Dept 
{
float salary;

public Salary(int empno, String name, String address, String loc, String designation, String dept, float salary) 
{
	super(empno, name, address, loc, designation, dept);
	this.salary = salary;
	//super.empno =21;
	}
void display()
{
	super.display();
	System.out.println("the salary is "+salary);
	System.out.println("the HRA is "+(salary*.1));
	System.out.println("the ITax is "+(salary*.25));
	}
public static void main(String[] args) {
	Salary ob=new Salary(101,"Soujanya","Bangalore","India","Dev","Software Engineer",78000.00f);
	ob.display();
	System.out.println(ob.empno);
}
}