public class User {
    private String name;
    private String email;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

// Отдельный класс для работы с пользователями
public class UserService {
    public void saveToDatabase(User user) {
        // код для сохранения пользователя в базу данных
    }

    public void sendEmail(User user) {
        // код для отправки электронного письма пользователю
    }

    public void printAddressLabel(User user) {
        // код для печати адресного ярлыка
    }
}
