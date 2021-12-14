package ord.howard.edu.lsp.assignment2;

public class Library { 
	
	String title;
	
	public Library(String title) {
        this.title = title;
	}
	
	public void addBook(Book book1) {
		Book book = new Book(title);
	}
	
	public void printOpeningHours() {
		System.out.println("Libraries are open daily from 9am to 5pm. ");
	}
	
	public void borrowBook(String title1) {
		System.out.println("Borrowing The Lord of the Rings:");
		Book book = new Book(null);
		book.borrowed(title1);
	}
	
	public void returnBook(String title1) {
		Book book = new Book(null);
		book.returned(title1);
	}
	
	public void printAddress() {
		System.out.println(title);
	}
	
	public void printAvailableBooks() {
		Book book = new Book(null);
		book.getTitle();
	}
	


	public static void main(String[] args) { 
	Library firstLibrary = new Library("10 Main St."); 
	Library secondLibrary = new Library("228 Liberty St."); 

	firstLibrary.addBook(new Book("The Da Vinci Code")); firstLibrary.addBook(new Book("Le Petit Prince")); 
	firstLibrary.addBook(new Book("A Tale of Two Cities")); firstLibrary.addBook(new Book("The Lord of the Rings")); 

	System.out.println("Library hours:");
	firstLibrary.printOpeningHours(); 
	System.out.println(); 
	System.out.println("Library addresses:"); 
	firstLibrary.printAddress(); 
	System.out.println("Library hours:");
	secondLibrary.printOpeningHours(); 
	System.out.println(); 
	System.out.println("Library addresses:"); 
	secondLibrary.printAddress(); 

	// Try to borrow The Lords of the Rings from both libraries System.out.println("Borrowing The Lord of the Rings:"); firstLibrary.borrowBook("The Lord of the Rings"); 
	firstLibrary.borrowBook("The Lord of the Rings"); secondLibrary.borrowBook("The Lord of the Rings"); 
	System.out.println(); 

	// Print the titles of all available books from both libraries System.out.println("Books available in the first library:"); firstLibrary.printAvailableBooks(); 
	System.out.println(); 
	System.out.println("Books available in the second library:"); secondLibrary.printAvailableBooks(); 
	System.out.println(); 

	// Return The Lords of the Rings to the first library 
	System.out.println("Returning The Lord of the Rings:"); firstLibrary.returnBook("The Lord of the Rings"); 
	System.out.println(); 
	   	 } 
	}

