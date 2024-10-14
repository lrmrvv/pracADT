import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConfigurationTest {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.submit(() -> {
            ConfigurationManager configManager = ConfigurationManager.getInstance();
            try {
                configManager.loadSettings("config.txt");
                System.out.println("Поток 1: Настройки загружены. Значение 'app.name' = " + configManager.getSetting("app.name"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        executorService.submit(() -> {
            ConfigurationManager configManager = ConfigurationManager.getInstance();
            configManager.setSetting("app.version", "1.0.2");
            try {
                configManager.saveSettings("config.txt");
                System.out.println("Поток 2: Настройки обновлены.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        executorService.submit(() -> {
            ConfigurationManager configManager = ConfigurationManager.getInstance();
            try {
                System.out.println("Поток 3: Значение 'app.version' = " + configManager.getSetting("app.version"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        executorService.shutdown();
    }
}
