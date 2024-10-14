import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LoggingApp {

    public static void main(String[] args) {
        LoggerConfig config = new LoggerConfig();
        Logger logger = Logger.getInstance();
        logger.setLogLevel(config.getLogLevel());

        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.submit(() -> logger.log("Это информационное сообщение", LogLevel.INFO));
        executor.submit(() -> logger.log("Это предупреждение", LogLevel.WARNING));
        executor.submit(() -> logger.log("Это ошибка", LogLevel.ERROR));

        executor.shutdown();

        System.out.println("Логи с уровнем WARNING и выше:");
        LogReader.readLogs(LogLevel.WARNING);
        
        logger.close();
    }
}

/*Пример вывода

Логи с уровнем WARNING и выше:
WARNING: Это предупреждение
ERROR: Это ошибка
*/
