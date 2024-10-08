public class UserM {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        // Добавление пользователей
        User user1 = new User("Иван Иванов", "ivan@gmail.com", "Admin");
        User user2 = new User("Анна Анновна", "anna@gmail.com", "User");
        userManager.addUser(user1);
        userManager.addUser(user2);

        // Обновление пользователя
        userManager.updateUser("anna@gmail.com", "Анна Анновна", "Admin");

        // Удаление пользователя
        userManager.removeUser("ivan@gmail.com");

        // Отображение всех пользователей
        userManager.displayUsers();
    }
}
