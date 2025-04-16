package src.com.lambda;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService_TraditionalAppr {
	public List<Book> getBookInSorted() {
		List<Book> listOfBooks = new BookDao().getBooks();
		//Collections.sort(listOfBooks, new BookComparator());
		Collections.sort(listOfBooks, new BookComparatorPages());
		return listOfBooks;
	}

	public static void main(String[] args) {
		System.out.println(new BookService_TraditionalAppr().getBookInSorted().toString());
	}

}

// comparator based on book name
class BookComparator implements Comparator<Book> {
	@Override
	public int compare(Book b1, Book b2) {
		return b1.getBookName().compareTo(b2.getBookName());
	}
}
// comparator based on number of pages

class BookComparatorPages implements Comparator<Book> {
	@Override
	public int compare(Book b1, Book b2) {
		return b1.getPages() - b2.getPages();
	}
}
