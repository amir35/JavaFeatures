package SingletonClass;

public class LoggerTest1 {

    //Single instance of the class
    public static LoggerTest1 instance;

    //Private constructor to prevent instantiation
    public LoggerTest1(){
        // Initialization code here
    }

    //Public method to provide access to the instance
    public static LoggerTest1 getInstance(){
        if(instance == null){
            synchronized (LoggerTest1.class) {
                if(instance == null) {
                    instance = new LoggerTest1();
                }
            }
        }
        return instance;
    }

    //Example Logging method
    public void log(String message) {
        System.out.println("Log: "+message);
    }

}
