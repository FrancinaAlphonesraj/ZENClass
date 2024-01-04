package Default;

import java.util.Scanner;

public class BookManagementSystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Library System");
		Library lib = new Library(10);
		
		while(true) {
			System.out.println("\n Menu:");
			System.out.println("1. Add a Book");
			System.out.println("2. Remoove Book");
			System.out.println("3. Search for a book");
			System.out.println("4. Display All Books");
			System.out.println("5. Exit");
			System.out.println("Enter Your Choice: ");
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1: 

				
				 System.out.print("Enter book ID: ");
                 int bookID = scanner.nextInt();
                 scanner.nextLine(); // Consume newline
                 System.out.print("Enter book title: ");
                 String title = scanner.nextLine();
                 System.out.print("Enter book author: ");
                 String author = scanner.nextLine();
				
			Book newBook = new Book(bookID, title, author);
                lib.addBook(newBook);
                break;
            case 2:
                System.out.print("Enter the book ID to remove: ");
                int removeID = scanner.nextInt();
                lib.removeBook(removeID);
                break;
            case 3:
                System.out.print("Enter the book ID to search: ");
                int searchID = scanner.nextInt();
                lib.searchBook(searchID);
                break;
            case 4:
                lib.displayBooks();
                break;
            case 5:
                System.out.println("Thank you for using the Library System!");
                scanner.close();
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
			}
		}

	}

}
