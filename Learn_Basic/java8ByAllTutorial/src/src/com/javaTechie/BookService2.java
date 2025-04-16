package src.com.javaTechie;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService2 {
	public List<Book> getBookListInSort() {
		BookDao bd = new BookDao();
		List<Book> list = bd.getBooks();
		Collections.sort(list, Comparator.comparing(Book::getName));  //This is second way to do the same
		return list;
	}

	public static void main(String[] args) {
		BookService b = new BookService();
		System.out.println(b.getBookListInSort());
	}
}
