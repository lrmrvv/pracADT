import java.util.ArrayList;
import java.util.List;

// Класс для представления пользователя
class User {
    private String name;
    private String email;
    private String role;

    public User(String name, String email, String role) {
        this.name = name;
        this.email = email;
        this.role = role;
    }

    public String rName() {
        return name;
    }

    public String rEmail() {
        return email;
    }

    public String rRole() {
        return role;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void displayInfo() {
        System.out.println("Имя: " + name + ", Email: " + email + ", Роль: " + role);
    }
}

// Класс для управления пользователями
class UserManager {
    private List<User> users;

    public UserManager() {
        users = new ArrayList<>();
    }

    // Метод для добавления пользователя
    public void addUser(User user) {
        users.add(user);
        System.out.println("Пользователь добавлен: " + user.rName());
    }

    // Метод для удаления пользователя
    public void removeUser(String email) {
        users.removeIf(user -> user.rEmail().equals(email));
        System.out.println("Пользователь с email " + email + " удален.");
    }

    // Метод для обновления информации о пользователе
    public void updateUser(String email, String newName, String newRole) {
        for (User user : users) {
            if (user.rEmail().equals(email)) {
                user.setName(newName);
                user.setRole(newRole);
                System.out.println("Пользователь с email " + email + " обновлен.");
                break;
            }
        }
    }

    // Метод для отображения всех пользователей
    public void displayUsers() {
        System.out.println("Список пользователей:");
        for (User user : users) {
            user.displayInfo();
        }
    }
}


