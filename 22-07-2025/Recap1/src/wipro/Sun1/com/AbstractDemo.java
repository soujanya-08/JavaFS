package wipro.Sun1.com;

class AbstractDemo extends Abstract1
{
	AbstractDemo()
	{
		super();
	}
	AbstractDemo(int a,int b)
	{
		super(a,b);
	}
	@Override
	void display() 
	{
		System.out.println("This is overridden display");
		}
	public static void main(String[] args) {
		AbstractDemo ob=new AbstractDemo(7,8);
		AbstractDemo ob1=new AbstractDemo();
		System.out.println("the sum is "+ob.sum(6, 3));
		ob.display();
	}
}
