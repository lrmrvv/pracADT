// Класс для управления библиотекой
import java.util.ArrayList;
import java.util.List;
class Library {
    private List<Book> books;
    private List<Reader> readers;

    public Library() {
        books = new ArrayList<>();
        readers = new ArrayList<>();
    }

    // Метод для добавления книги
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Книга \"" + book.rTitle() + "\" добавлена в библиотеку.");
    }

    // Метод для удаления книги
    public void removeBook(Book book) {
        books.remove(book);
        System.out.println("Книга \"" + book.rTitle() + "\" удалена из библиотеки.");
    }

    // Метод для регистрации читателя
    public void registerReader(Reader reader) {
        readers.add(reader);
        System.out.println("Читатель \"" + reader.rName() + "\" зарегистрирован.");
    }

    // Метод для удаления читателя
    public void removeReader(Reader reader) {
        readers.remove(reader);
        System.out.println("Читатель \"" + reader.rName() + "\" удален.");
    }

    // Метод для выдачи книги читателю
    public void lendBook(String isbn, String readerId) {
        Book bookToLend = null;
        for (Book book : books) {
            if (book.rIsbn().equals(isbn)) {
                bookToLend = book;
                break;
            }
        }

        if (bookToLend != null && bookToLend.rCopies() > 0) {
            bookToLend.borrowBook();
            System.out.println("Книга \"" + bookToLend.rTitle() + "\" выдана читателю с ID " + readerId + ".");
        } else {
            System.out.println("Книга недоступна для выдачи.");
        }
    }

    // Метод для возврата книги
    public void returnBook(String isbn) {
        for (Book book : books) {
            if (book.rIsbn().equals(isbn)) {
                book.returnBook();
                System.out.println("Книга \"" + book.rTitle() + "\" возвращена в библиотеку.");
                break;
            }
        }
    }

    // Метод для отображения всех книг
    public void displayBooks() {
        System.out.println("Книги в библиотеке:");
        for (Book book : books) {
            book.displayInfo();
        }
    }

    // Метод для отображения всех читателей
    public void displayReaders() {
        System.out.println("Читатели библиотеки:");
        for (Reader reader : readers) {
            reader.displayInfo();
        }
    }
}

