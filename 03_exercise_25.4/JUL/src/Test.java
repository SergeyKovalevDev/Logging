import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Test {
    public static final Logger logger = Logger.getLogger(Test.class.getName());

    public static void main(String[] args) throws IOException {
        LogManager logManager = LogManager.getLogManager();
        logManager.readConfiguration(Test.class.getResourceAsStream("logging.properties"));
        System.out.println(logManager.getProperty("java.util.logging.FileHandler.limit"));
        logger.log(Level.INFO, logger.getName() + ": Hello world");
        logger.warning(() -> "Ooops!");
    }
}