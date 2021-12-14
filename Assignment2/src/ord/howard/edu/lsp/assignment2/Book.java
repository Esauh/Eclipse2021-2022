package ord.howard.edu.lsp.assignment2;

public class Book {

    String title;

    boolean borrowed;


    public Book(String bookTitle) {

        this.title = bookTitle;

    }

    public void borrowed(String title1) {

        this.borrowed = true;

    }


    public void returned(String title1) {

        this.borrowed = false;

    }


    public boolean isBorrowed() {

        return this.borrowed;

    }


    public String getTitle() {

        return this.title;

    }

    public static void main(String[] args) {


        Book book = new Book("Sherlock Homles");

        System.out.println("Title : " + book.getTitle());

        System.out.println("Is borrowed? : " + book.isBorrowed());

        book.borrowed(null);

        System.out.println("Is borrowed? : " + book.isBorrowed());

        book.returned(null);

        System.out.println("Is borrowed? : " + book.isBorrowed());

    }

}
