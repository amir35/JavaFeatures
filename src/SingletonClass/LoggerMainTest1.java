package SingletonClass;

public class LoggerMainTest1 {

    public static void main(String[] args) {

        //Get the single instance of Logger
        LoggerTest1 logger1 = LoggerTest1.getInstance();
        LoggerTest1 logger2 = LoggerTest1.getInstance();

        //Log message using the single instance
        logger1.log("This is the first log message");
        logger2.log("This is the second log message");

        //Verify that both points to the same instance
        System.out.println(logger1 == logger2);

    }
}
