public class Config {
    private static final String connectionString = "Server=myServer;Database=myDb;User Id=myUser;Password=myPass;";

    public static String getConnectionString() {
        return connectionString;
    }
}

public class DatabaseService {
    public void connect() {
        String connectionString = Config.getConnectionString();
        System.out.println("Подключение к базе данных с использованием: " + connectionString);
    }
}

public class LoggingService {
    public void log(String message) {
        String connectionString = Config.getConnectionString();
        System.out.println("Запись лога: " + message + " с использованием: " + connectionString);
    }
}

public class Main {
    public static void main(String[] args) {
        DatabaseService dbService = new DatabaseService();
        LoggingService logService = new LoggingService();

        dbService.connect();
        logService.log("Это тестовый лог");
    }
}
