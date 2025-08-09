package wipro.Sun1.com;

public class BookMain {
public static void main(String args[]) {
	Book obj=new Book();
	obj.setBook_id(101);
	obj.setBook_name("Complete Java");
	obj.setAuthor("Soujanya");
	obj.setPrice(1000.99f);
	System.out.println("the book id is "+obj.getBook_id());
	System.out.println("the book name is "+obj.getBook_name());
	System.out.println("the book author is "+obj.getAuthor());
	System.out.println("the book price is "+obj.getPrice());
	Book obj1=new Book(102,"Python","Joy",25.35f);
	System.out.println(obj1);//using toString, object will be printed in string format else in Hashcode
}
}
