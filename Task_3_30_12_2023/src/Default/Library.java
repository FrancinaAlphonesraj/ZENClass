package Default;

public class Library {
	
	private Book[] books;
    private int capacity;
    private int bookCount;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new Book[capacity];
        this.bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < capacity) {
            books[bookCount] = book;
            bookCount++;
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void removeBook(int bookID) {
    	 for (int i = 0; i < bookCount; i++) {
             if (books[i].getBookID() == bookID) {
                 books[i].setAvailable(false);
                 System.out.println("Book removed successfully.");
                 return;
             }
         }
         System.out.println("Book with ID " + bookID + " not found.");
    }
    public void searchBook(int bookID) {
    	for (int i = 0; i < bookCount; i++) {
            if (books[i].getBookID() == bookID) {
                System.out.println("Book found:");
                System.out.println(books[i]);
                return;
            }
        }
        System.out.println("Book with ID " + bookID + " not found.");
    }

    public void displayBooks() {
    	System.out.println("Books in the library:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println(books[i]);
        }
    }
}
