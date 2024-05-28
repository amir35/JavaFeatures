package SingletonClass;

public class LoggerMainTest2 {

    public static void main(String[] args) {
        // Get the single instance of Logger
        LoggerTest2 logger1 = LoggerTest2.getInstance();
        LoggerTest2 logger2 = LoggerTest2.getInstance();

        // Log messages using the single instance
        logger1.log("Application started.");
        logger1.log("Another log message.");

        logger2.log("This message is from second other");

        // Close the logger when done (for example, at application shutdown)
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            LoggerTest2 logger = LoggerTest2.getInstance();
            logger.close();
        }));
    }
}

