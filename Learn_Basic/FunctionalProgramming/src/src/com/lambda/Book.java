package src.com.lambda;

public class Book {
	private int id;
	private String bookName;
	private int pages;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String bookName, int pages) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.pages = pages;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", pages=" + pages + "]";
	}
	

}
