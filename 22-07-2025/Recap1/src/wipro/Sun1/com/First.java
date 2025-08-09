package wipro.Sun1.com;

import java.util.Scanner;

public class First {
	int rollno;
	String name, address;
	void display() {
		Scanner sc = new Scanner(System.in);
		rollno = sc.nextInt();
		name = sc.next();
		sc.close();
		
	}
	public static void main(String[] args) {
		System.out.println("Enter roll no and name");
		First f = new First();
		f.display();
		System.out.println("roll no is "+ f.rollno + " name is "+ f.name);
		
	}

}
