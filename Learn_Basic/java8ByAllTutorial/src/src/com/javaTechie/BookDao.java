package src.com.javaTechie;

import java.util.ArrayList;
import java.util.List;

public class BookDao {
	public List<Book> getBooks() {
		List<Book> booklist = new ArrayList<>();
		booklist.add(new Book(1, "Book One", 100));
		booklist.add(new Book(2, "Book Two", 150));
		booklist.add(new Book(3, "Book Three", 200));
		booklist.add(new Book(4, "Book Four", 250));
		booklist.add(new Book(5, "Book Five", 300));
		booklist.add(new Book(6, "Book Six", 350));
		booklist.add(new Book(7, "Book Seven", 400));
		booklist.add(new Book(8, "Book Eight", 450));
		booklist.add(new Book(9, "Book Nine", 500));
		booklist.add(new Book(10, "Book Ten", 550));
		booklist.add(new Book(11, "Book Eleven", 600));
		booklist.add(new Book(12, "Book Twelve", 650));
		booklist.add(new Book(13, "Book Thirteen", 700));
		booklist.add(new Book(14, "Book Fourteen", 750));
		booklist.add(new Book(15, "Book Fifteen", 800));
		booklist.add(new Book(16, "Book Sixteen", 850));
		booklist.add(new Book(17, "Book Seventeen", 900));
		booklist.add(new Book(18, "Book Eighteen", 950));
		booklist.add(new Book(19, "Book Nineteen", 1000));
		booklist.add(new Book(20, "Book Twenty", 1050));
		return booklist;
	}
	
}
