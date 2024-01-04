package Default;

public class Book {

//	attributes
	public int bookID;
	public String title;
	public String author;
	public boolean isAvailable;
	
//	Constructor
	public Book(int bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
	
//	Getter and Setter
	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	@Override
    public String toString() {
        return "Book ID: " + bookID +
                ", Title: '" + title + '\'' +
                ", Author: '" + author + '\'' +
                ", Available: " + isAvailable;
    }

}
