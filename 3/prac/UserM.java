public class UserM {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        // Добавление пользователей
        User user1 = new User("Иван Иванов", "ivan@example.com", "Admin");
        User user2 = new User("Анна Смирнова", "anna@example.com", "User");
        userManager.addUser(user1);
        userManager.addUser(user2);

        // Обновление пользователя
        userManager.updateUser("anna@example.com", "Анна Смирнова", "Admin");

        // Удаление пользователя
        userManager.removeUser("ivan@example.com");

        // Отображение всех пользователей
        userManager.displayUsers();
    }
}
