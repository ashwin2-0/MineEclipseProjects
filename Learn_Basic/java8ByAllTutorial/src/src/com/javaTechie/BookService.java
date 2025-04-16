package src.com.javaTechie;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
	public List<Book> getBookListInSort() {
		BookDao bd = new BookDao();
		List<Book> list = bd.getBooks();
		Collections.sort(list, (b1, b2) -> {
			return b1.getName().compareTo(b2.getName());
		});

		return list;
	}

	public static void main(String[] args) {
		BookService b = new BookService();
		System.out.println(b.getBookListInSort());
	}
}
/*
 * class ComparatorBook implements Comparator<Book> { public int compare(Book
 * b1, Book b2) { return b1.getName().compareTo(b2.getName()); } }
 * 
 */