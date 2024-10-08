import java.util.ArrayList;
import java.util.List;

// Класс для представления книги
class Book {
    private String title;
    private String author;
    private String isbn;
    private int copies;

    public Book(String title, String author, String isbn, int copies) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.copies = copies;
    }

    public String rTitle() {
        return title;
    }

    public String rAuthor() {
        return author;
    }

    public String rIsbn() {
        return isbn;
    }

    public int rCopies() {
        return copies;
    }

    public void borrowBook() {
        if (copies > 0) {
            copies--;
        } else {
            System.out.println("Книга \"" + title + "\" недоступна.");
        }
    }

    public void returnBook() {
        copies++;
    }

    public void displayInfo() {
        System.out.println("Книга: " + title + ", Автор: " + author + ", ISBN: " + isbn + ", Доступные экземпляры: " + copies);
    }
}
