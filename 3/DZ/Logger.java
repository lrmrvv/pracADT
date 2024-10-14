public class Logger {
    
    public void log(String level, String message) {
        System.out.println(level + ": " + message);
    }

    public void logError(String message) {
        log("ERROR", message);
    }

    public void logWarning(String message) {
        log("WARNING", message);
    }

    public void logInfo(String message) {
        log("INFO", message);
    }

    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.logError("Это сообщение об ошибке");
        logger.logWarning("Это предупреждающее сообщение");
        logger.logInfo("Это информационное сообщение");
    }
}
