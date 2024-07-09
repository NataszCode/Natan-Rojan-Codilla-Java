import com.kodilla.patterns.singleton.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    @Test
    void testGetLastLog() {

        Logger logger = Logger.getInstance();
        logger.log("Test log");


        String lastLog = logger.getLastLog();


        Assertions.assertEquals("Test log", lastLog);
    }

    @Test
    void testSingletonProperty() {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();


        logger1.log("Log from logger1");
        String lastLogFromLogger2 = logger2.getLastLog();


        Assertions.assertEquals("Log from logger1", lastLogFromLogger2);
        Assertions.assertSame(logger1, logger2);
    }
}
