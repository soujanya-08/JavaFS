package wipro.Sun1.com;

import java.util.Scanner;

public class PowerCalculator
{
    public static void main(String[] args)
    {
             Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();
            System.out.print("Enter the exponent number: ");
        double exponent = scanner.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}