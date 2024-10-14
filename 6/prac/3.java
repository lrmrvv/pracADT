/*{
    "logLevel": "WARNING",
    "logFilePath": "logs.txt"
}
*/

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class LoggerConfig {
    private LogLevel logLevel;
    private String logFilePath;

    public LoggerConfig() {
        loadConfig();
    }

    private void loadConfig() {
        JSONParser parser = new JSONParser();
        try (FileReader reader = new FileReader("config.json")) {
            JSONObject config = (JSONObject) parser.parse(reader);
            logLevel = LogLevel.valueOf((String) config.get("logLevel"));
            logFilePath = (String) config.get("logFilePath");
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public String getLogFilePath() {
        return logFilePath;
    }
}
