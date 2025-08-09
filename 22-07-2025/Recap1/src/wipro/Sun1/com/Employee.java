package wipro.Sun1.com;
public class Employee 
{
	int empno;
	String name,address;
	public Employee(int empno, String name, String address) 
	{
		this.empno = empno;
		this.name = name;
		this.address = address;
	}
void display()
{
	System.out.println("The empno is "+empno+" The name is "+name+" The address is "+address);
}
}