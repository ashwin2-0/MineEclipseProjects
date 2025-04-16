package src.com.lambda;

import java.util.Arrays;
import java.util.List;

public class BookDao {
	public List<Book> getBooks() {
		List<Book> books = Arrays.asList(new Book(1, "Hall of Fame", 405), new Book(2, "Two States", 894),
				new Book(3, "Wings of Fire", 501), new Book(4, "The Alchemist", 208),
				new Book(5, "The Great Gatsby", 180), new Book(6, "To Kill a Mockingbird", 281),
				new Book(7, "1984", 328), new Book(8, "Brave New World", 288),
				new Book(9, "The Catcher in the Rye", 277), new Book(10, "Crime and Punishment", 545),
				new Book(11, "Pride and Prejudice", 432), new Book(12, "War and Peace", 1225),
				new Book(13, "The Odyssey", 560), new Book(14, "Les Misérables", 1463),
				new Book(15, "Anna Karenina", 864), new Book(16, "The Book Thief", 584),
				new Book(17, "The Kite Runner", 372), new Book(18, "The Shining", 447), new Book(19, "Gone Girl", 422),
				new Book(20, "The Road", 287)

		);
		return books;
	}

}