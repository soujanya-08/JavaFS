package wipro.Sun1.com;
abstract class Abstract1
{
Abstract1()
{
	System.out.println("this is a constractor");
}
Abstract1(int a,int b)
{
	System.out.println("the sum of super constrctor is "+(a+b));
}
abstract void display();
int sum(int a,int b)
{
	return a+b;
}
}
