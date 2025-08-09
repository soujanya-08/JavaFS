package wipro.Sun1.com;
public class Dept extends Employee 
{
String loc,designation,dept;

public Dept(int empno, String name, String address, String loc, String designation, String dept) 
{
	super(empno, name, address);//first the super class constructor will execute
	//this.empno = 23;
	this.loc = loc;
	this.designation = designation;
	this.dept = dept;
}
void display()
{
	super.display();
	System.out.println("the location is "+loc+" the designation is "+designation+" The deptment is "+dept);
}
}