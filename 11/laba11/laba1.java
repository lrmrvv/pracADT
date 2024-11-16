import java.util.*;

class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void markAsLoaned() {
        isAvailable = false;
    }

    public void markAsAvailable() {
        isAvailable = true;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Available: " + isAvailable;
    }
}

class Reader {
    private int id;
    private String name;
    private String email;
    private List<Book> borrowedBooks;

    public Reader(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.borrowedBooks = new ArrayList<>();
    }

    public boolean borrowBook(Book book) {
        if (book.isAvailable()) {
            book.markAsLoaned();
            borrowedBooks.add(book);
            return true;
        }
        return false;
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.markAsAvailable();
        }
    }

    public void showRentedBooks() {
        System.out.println(name + "'s borrowed books:");
        for (Book book : borrowedBooks) {
            System.out.println(book);
        }
    }
}

class Librarian {
    private int id;
    private String name;
    private String position;

    public Librarian(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public void addBook(Library library, Book book) {
        library.addBook(book);
    }

    public void removeBook(Library library, Book book) {
        library.removeBook(book);
    }
}

class Loan {
    private Book book;
    private Reader reader;
    private Date loanDate;
    private Date returnDate;

    public Loan(Book book, Reader reader, Date loanDate, Date returnDate) {
        this.book = book;
        this.reader = reader;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }

    public void issueLoan() {
        book.markAsLoaned();
    }

    public void completeLoan() {
        book.markAsAvailable();
    }
}

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public Book searchBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public List<Book> searchBooksByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }
        }
        return result;
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("C# Programming", "John Doe", "12345");
        Book book2 = new Book("Java Programming", "Jane Smith", "67890");

        Librarian librarian = new Librarian(1, "Alice", "Senior Librarian");
        librarian.addBook(library, book1);
        librarian.addBook(library, book2);

        Reader reader = new Reader(1, "Bob", "bob@example.com");

        System.out.println("Library books:");
        library.displayBooks();

        System.out.println("\nReader Borrows 'C# Programming'");
        reader.borrowBook(book1);
        library.displayBooks();

        System.out.println("\nReader Returns 'C# Programming'");
        reader.returnBook(book1);
        library.displayBooks();
    }
}
