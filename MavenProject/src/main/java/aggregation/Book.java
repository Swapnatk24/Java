package aggregation;

public class Book {

	String bookName;
	int bookPrice;
	  
	Author auth; //ref var
	
	public Book(String bookName,int bookPrice,Author auth)
	{		
		this.bookName=bookName;
		this.bookPrice=bookPrice;
		this.auth=auth;
	}
	
	public void display()
	{
		System.out.println("Name of book :"+bookName);
		System.out.println("Price of book :"+bookPrice);
		System.out.println("Name of author :"+auth.authorName);
		System.out.println("Place of author :"+auth.authorPlace);	
	}
	
	public static void main(String[] args) {
		Author objauth =new Author("Colleen Hoover","US");
		Book objbook= new Book("It ends with us",215,objauth);
		objbook.display();
	}
}
