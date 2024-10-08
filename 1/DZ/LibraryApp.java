public class LibraryApp {
    public static void main(String[] args) {
        // Создание библиотеки
        Library library = new Library();

        // Создание книг
        Book book1 = new Book("Война и мир", "Лев Толстой", "978-1234567890", 3);
        Book book2 = new Book("Преступление и наказание", "Федор Достоевский", "978-0987654321", 2);

        // Добавление книг в библиотеку
        library.addBook(book1);
        library.addBook(book2);

        // Создание читателей
        Reader reader1 = new Reader("Иван Иванов", "R001");
        Reader reader2 = new Reader("Анна Петрова", "R002");

        // Регистрация читателей
        library.registerReader(reader1);
        library.registerReader(reader2);

        // Выдача книги читателю
        library.lendBook("978-1234567890", "R001");

        // Возврат книги
        library.returnBook("978-1234567890");

        // Отображение всех книг и читателей
        library.displayBooks();
        library.displayReaders();
    }
}
