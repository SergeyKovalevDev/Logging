import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestLog{
    private static final Logger log = LogManager.getLogger(TestLog.class);
    public static void main(String[] args){
        log.info("Это информационное сообщение!");
        log.error("Это сообщение ошибки");
    }
}