package wipro.Sun1.com;
class Book
{
	 int book_id;
	 String book_name;
	 String author;
	 float price;
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Book(int book_id, String book_name, String author, float price) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.author = author;
		this.price = price;
		System.out.println(book_id+" "+book_name+" "+author+" "+price);
	}
	public Book() {
		System.out.println("default constructor");
	}
	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", book_name=" + book_name + ", author=" + author + ", price=" + price
				+ "]";
	}
}