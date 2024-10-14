import java.io.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Logger {
    private static Logger instance;
    private static Lock lock = new ReentrantLock();
    private LogLevel currentLogLevel = LogLevel.INFO;
    private BufferedWriter writer;

  private Logger() {
        try {
            writer = new BufferedWriter(new FileWriter("logs.txt", true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Logger getInstance() {
        if (instance == null) {
            lock.lock();
            try {
                if (instance == null) {
                    instance = new Logger();
                }
            } finally {
                lock.unlock();
            }
        }
        return instance;
    }

    public void setLogLevel(LogLevel level) {
        currentLogLevel = level;
    }

    public void log(String message, LogLevel level) {
        if (level.ordinal() >= currentLogLevel.ordinal()) {
            writeToFile(message, level);
        }
    }

    private void writeToFile(String message, LogLevel level) {
        lock.lock();
        try {
            writer.write(level + ": " + message);
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void close() {
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
