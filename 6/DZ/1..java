import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private static final Object lock = new Object();
    private Map<String, String> settings;

    private ConfigurationManager() {
        settings = new HashMap<>();
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }

    public void loadSettings(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] keyValue = line.split("=");
                if (keyValue.length == 2) {
                    settings.put(keyValue[0].trim(), keyValue[1].trim());
                }
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("Файл настроек не найден: " + filePath);
        } catch (IOException e) {
            throw new IOException("Ошибка при чтении файла настроек: " + filePath);
        }
    }

    public String getSetting(String key) {
        if (!settings.containsKey(key)) {
            throw new IllegalArgumentException("Настройка с ключом " + key + " не найдена");
        }
        return settings.get(key);
    }

    public void setSetting(String key, String value) {
        settings.put(key, value);
    }

    public void saveSettings(String filePath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Map.Entry<String, String> entry : settings.entrySet()) {
                writer.write(entry.getKey() + "=" + entry.getValue());
                writer.newLine();
            }
        } catch (IOException e) {
            throw new IOException("Ошибка при сохранении настроек в файл: " + filePath);
        }
    }
}
