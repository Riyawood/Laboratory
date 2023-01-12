package oops;
import java.util.Scanner;
class Book{
	int bookid,bookPrice;
	String bookName,authorName, availability;
	static String libraryName="The Collection";
	static int count=1;
	
public void createBook(int bookid, String bookName, int bookPrice, String authorName, String availability)
{
	this.bookid=bookid;
	this.bookName= bookName;
	this.bookPrice=bookPrice;
	this.authorName=authorName;
	this.availability=availability;
}

public void borrowBook()
{
	if(availability.equals("available")||availability.equals("Available"))
		System.out.println("The book is avaiable to borrow.");
	else
		System.out.println("The book is not available to borrow.");
	
	System.out.println();
	
}
public void displayBook()
{
	int c = count++;
	System.out.println(c+") "+bookName);
}
public void displayBookByName()
{
		
		System.out.println("Book ID: "+bookid+"\nBook Name: "+bookName+"\nBook Price: "+bookPrice+""
			+"\nAuthor Name: "+authorName+"\nAvailability: "+availability+"\nLibrary Name: "+libraryName);
		System.out.println();
}
}

public class BookManagement 
{
   public static void main(String[] args) 
   {
	   Scanner sc = new Scanner(System.in);
		//Entering book details
		Book b1 = new Book();
		b1.createBook(121,"Fault in our Stars",350,"John Green","Available");
		b1.displayBook();
		Book b2 = new Book();
		b2.createBook(122,"The Lord of the Rings",500,"JRR Tolkien","Available");
		b2.displayBook();
		Book b3 = new Book();
		b3.createBook(123,"Harry Potter Sorcerer's Stone",550,"JK Rowling","Available");
		b3.displayBook();
		Book b4 = new Book();
		b4.createBook(124,"The Hobbit",399,"JRR Tolkien","Not Available");
		b4.displayBook();
		Book b5 = new Book();
		b5.createBook(125,"The Da Vinci Code",500,"Dan Brown","Not Available");
		b5.displayBook();
		System.out.println();
		
		do {
		System.out.println("Enter an option: \n1)Create a book\n2) To Check Details of Book."
				+ "\n3) To Check whether available to borrow or not."
				+ "\n4) Exit");
		int choice = sc.nextInt();
		if(choice==1)
		{
			Book b6 = new Book();
			System.out.println("Enter book id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter book name: ");
			String bname= sc.nextLine();
			System.out.println("Enter price: ");
			int price = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter author name: ");
			String auth= sc.nextLine();
			System.out.println("Enter Availability:");
			String avail = sc.next();
			b6.createBook(id, bname, price, auth, avail);
			b6.displayBookByName();
		}
		else if(choice==2)
		{
		//checking details of the book
			System.out.println("Enter which book to check details: ");
			System.out.println("1)"+b1.bookName+" \n2)" +b2.bookName
					+ "\n3)"+b3.bookName+" \n4)" +b4.bookName+ 
					 "\n5)"+b5.bookName);
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				b1.displayBookByName();
				break;
			case 2:
				b2.displayBookByName();
				break;
			case 3:
				b3.displayBookByName();
				break;
			case 4:
				b4.displayBookByName();
				break;
			case 5:
				b5.displayBookByName();
				break;
			default:
				System.out.println("No available books.");
		     }
		}
		else if(choice==3)
		{
			//To check whether the book is available to borrow or not
			System.out.println("Enter to check which book is available or not: ");
			System.out.println("1)"+b1.bookName+" \n2)" +b2.bookName
					+ "\n3)"+b3.bookName+" \n4)" +b4.bookName+ 
					 "\n5)"+b5.bookName);
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Is "+b1.bookName+" available to borrow?");
				b1.borrowBook();
				break;
			case 2:
				System.out.println("Is "+b2.bookName+" available to borrow?");
				b2.borrowBook();
				break;
			case 3:
				System.out.println("Is "+b3.bookName+" available to borrow?");
				b3.borrowBook();
				break;
			case 4:
				System.out.println("Is "+b4.bookName+" available to borrow?");
				b4.borrowBook();
				break;
			case 5:
				System.out.println("Is "+b5.bookName+" available to borrow?");
				b5.borrowBook();
				break;
			default:
				System.out.println("Wrong Choice!!");
				
			}
		}
		else if(choice==4)
		{
			System.exit(0);
		}
		else
			System.out.println("Wrong Option!!!");

		}
		while(true);
	}
}
