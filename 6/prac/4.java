import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LogReader {

    public static void readLogs(LogLevel filterLevel) {
        try (BufferedReader reader = new BufferedReader(new FileReader("logs.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (shouldDisplay(line, filterLevel)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean shouldDisplay(String line, LogLevel filterLevel) {
        if (line.startsWith(filterLevel.name())) {
            return true;
        }
        return false;
    }
}
