import java.util.ArrayList;

// Book Class
class Book {
    String title;
    String author;
    String isbn;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Method to display book details
    public void displayBook() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("ISBN   : " + isbn);
        System.out.println("--------------------------");
    }
}

// Library Class
class Library {
    ArrayList<Book> books = new ArrayList<>();

    // Method to add book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    // Method to search book by title
    public Book searchByTitle(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Method to display all books
    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("Library is empty.");
        } else {
            for (Book book : books) {
                book.displayBook();
            }
        }
    }
}

// Main Class
public class Scenario1 {

    public static void main(String[] args) {

        Library library = new Library();

        // Adding books
        Book b1 = new Book("Java Basics", "James Gosling", "1111");
        Book b2 = new Book("Data Structures", "Mark Allen", "2222");
        Book b3 = new Book("Operating Systems", "Abraham Silberschatz", "3333");

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        System.out.println("\n--- All Books in Library ---");
        library.displayAllBooks();

        // Searching book
        System.out.println("\n--- Searching for Book ---");
        Book foundBook = library.searchByTitle("Java Basics");

        if (foundBook != null) {
            System.out.println("Book Found:");
            foundBook.displayBook();
        } else {
            System.out.println("Book not found.");
        }
    }
}
