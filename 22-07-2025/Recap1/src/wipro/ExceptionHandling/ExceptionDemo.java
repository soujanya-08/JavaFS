package wipro.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

class Except{
	void display() {
		try {
			System.out.println("Enter two numbers to be divided: ");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a/b;
			System.out.println(c);
			String str ="hello";
			//int num = Integer.parseInt(str);
			String str1 = null;
			//System.out.println(str1.length());
			int[] arr = new int[5];
			arr[6] = 90;
		}
		catch(ArithmeticException ex) {
			System.out.println(ex);
		}
		catch(NumberFormatException ex) {
			System.out.println(ex);
		}
		catch(NullPointerException ex) {
			System.out.println(ex);
		}
		catch(InputMismatchException ex) {
			System.out.println(ex);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Exception Handled");
	}
}
public class ExceptionDemo {

	public static void main(String[] args) {
		Except e = new Except();
		e.display();

	}

}
