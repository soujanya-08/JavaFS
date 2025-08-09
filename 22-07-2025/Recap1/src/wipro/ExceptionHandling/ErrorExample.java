package wipro.ExceptionHandling;

import java.util.Scanner;

public class ErrorExample 
{
public static void main(String[] args) throws Exception 
{
	float Balance=5000.00f; 
	Scanner ob=new Scanner(System.in);
	System.out.println("Enter the amount to withdraw");
	float wd=ob.nextFloat();
	if(Balance-wd>=1000)
	{
		Balance=Balance-wd;
		System.out.println("You can withdraw the amount");
		System.out.println("The balance is "+Balance);
			}
	else
		throw new Exception("You cannot withdraw the amount");
}
}