import java.util.*;

class Book {
    private String title;  // Название книги
    private String author;  // Автор книги
    private String isbn;  // ISBN книги
    private boolean isAvailable;  // Статус доступности книги

    // Конструктор для инициализации книги
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;  // По умолчанию книга доступна
    }

    // Геттеры для получения информации о книге
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Метод для проверки доступности книги
    public boolean isAvailable() {
        return isAvailable;
    }

    // Метод для пометки книги как выданной
    public void markAsLoaned() {
        isAvailable = false;
    }

    // Метод для пометки книги как доступной
    public void markAsAvailable() {
        isAvailable = true;
    }

    // Переопределение метода toString для вывода информации о книге
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Available: " + isAvailable;
    }
}

class Reader {
    private int id;  // Идентификатор читателя
    private String name;  // Имя читателя
    private String email;  // Электронная почта читателя
    private List<Book> borrowedBooks;  // Список книг, взятых читателем

    // Конструктор для инициализации читателя
    public Reader(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.borrowedBooks = new ArrayList<>();
    }

    // Метод для того, чтобы читатель взял книгу
    public boolean borrowBook(Book book) {
        if (book.isAvailable()) {  // Проверка доступности книги
            book.markAsLoaned();  // Помечаем книгу как выданную
            borrowedBooks.add(book);  // Добавляем книгу в список взятых
            return true;
        }
        return false;  // Если книга недоступна, возвращаем false
    }

    // Метод для возврата книги
    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {  // Проверяем, взял ли читатель эту книгу
            borrowedBooks.remove(book);  // Убираем книгу из списка взятых
            book.markAsAvailable();  // Помечаем книгу как доступную
        }
    }

    // Метод для отображения всех взятых книг
    public void showRentedBooks() {
        System.out.println(name + "'s borrowed books:");
        for (Book book : borrowedBooks) {
            System.out.println(book);  // Выводим информацию о каждой взятой книге
        }
    }
}

class Librarian {
    private int id;  // Идентификатор библиотекаря
    private String name;  // Имя библиотекаря
    private String position;  // Должность библиотекаря

    // Конструктор для инициализации библиотекаря
    public Librarian(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    // Метод для добавления книги в библиотеку
    public void addBook(Library library, Book book) {
        library.addBook(book);  // Добавляем книгу в библиотеку
    }

    // Метод для удаления книги из библиотеки
    public void removeBook(Library library, Book book) {
        library.removeBook(book);  // Удаляем книгу из библиотеки
    }
}

class Loan {
    private Book book;  // Книга, которая выдается
    private Reader reader;  // Читатель, который берет книгу
    private Date loanDate;  // Дата выдачи книги
    private Date returnDate;  // Дата возврата книги

    // Конструктор для инициализации данных о займе
    public Loan(Book book, Reader reader, Date loanDate, Date returnDate) {
        this.book = book;
        this.reader = reader;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }

    // Метод для оформления займа
    public void issueLoan() {
        book.markAsLoaned();  // Помечаем книгу как выданную
    }

    // Метод для завершения займа (возврат книги)
    public void completeLoan() {
        book.markAsAvailable();  // Помечаем книгу как доступную
    }
}

class Library {
    private List<Book> books;  // Список всех книг в библиотеке

    // Конструктор для инициализации библиотеки
    public Library() {
        this.books = new ArrayList<>();
    }

    // Метод для отображения всех книг в библиотеке
    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);  // Выводим информацию о каждой книге
        }
    }

    // Метод для добавления книги в библиотеку
    public void addBook(Book book) {
        books.add(book);  // Добавляем книгу в список
    }

    // Метод для удаления книги из библиотеки
    public void removeBook(Book book) {
        books.remove(book);  // Удаляем книгу из списка
    }

    // Метод для поиска книги по названию
    public Book searchBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {  // Сравниваем название книги (игнорируя регистр)
                return book;  // Если книга найдена, возвращаем её
            }
        }
        return null;  // Если книга не найдена, возвращаем null
    }

    // Метод для поиска книг по автору
    public List<Book> searchBooksByAuthor(String author) {
        List<Book> result = new ArrayList<>();  // Список для хранения найденных книг
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {  // Сравниваем автора (игнорируя регистр)
                result.add(book);  // Добавляем книгу в результат
            }
        }
        return result;  // Возвращаем список найденных книг
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();  // Создаем экземпляр библиотеки

        // Создаем несколько книг
        Book book1 = new Book("C# Programming", "John Doe", "12345");
        Book book2 = new Book("Java Programming", "Jane Smith", "67890");

        // Создаем библиотекаря и добавляем книги в библиотеку
        Librarian librarian = new Librarian(1, "Alice", "Senior Librarian");
        librarian.addBook(library, book1);
        librarian.addBook(library, book2);

        // Создаем читателя
        Reader reader = new Reader(1, "Bob", "bob@example.com");

        // Выводим список книг в библиотеке
        System.out.println("Library books:");
        library.displayBooks();

        // Читатель берет книгу
        System.out.println("\nReader Borrows 'C# Programming'");
        reader.borrowBook(book1);
        library.displayBooks();

        // Читатель возвращает книгу
        System.out.println("\nReader Returns 'C# Programming'");
        reader.returnBook(book1);
        library.displayBooks();
    }
}
