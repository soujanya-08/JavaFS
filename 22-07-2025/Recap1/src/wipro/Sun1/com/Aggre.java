package wipro.Sun1.com;

public class Aggre {
	
	int empno;
	String name,address;
	Bank bk;
	public Aggre(int empno, String name, String address, Bank bk) 
	{
		this.empno = empno;
		this.name = name;
		this.address = address;
		this.bk = bk;
	}
	void show()
	{
		System.out.println("empno is "+empno);
		System.out.println("name is "+name);
		System.out.println("address is "+address);
		System.out.println("Bank details is "+bk);
		}
	

}
