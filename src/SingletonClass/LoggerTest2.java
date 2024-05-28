package SingletonClass;

import java.io.FileWriter;
import java.io.IOException;

public class LoggerTest2 {
    private static LoggerTest2 instance;

    // Example member variables
    private String logFilePath;
    private FileWriter logFileWriter;

    // Private constructor to prevent instantiation
    private LoggerTest2() {
        // Initialization code here
        logFilePath = "application.log";
        try {
            logFileWriter = new FileWriter(logFilePath, true); // Open in append mode
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Logger initialized");
    }

    // Public method to provide access to the instance
    public static LoggerTest2 getInstance() {
        if (instance == null) {
            synchronized (LoggerTest2.class) {
                if (instance == null) {
                    instance = new LoggerTest2();
                }
            }
        }
        return instance;
    }

    // Example logging method
    public void log(String message) {
        try {
            logFileWriter.write(message + "\n");
            logFileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Log: " + message);
    }

    // Method to close the logger (for example, on application shutdown)
    public void close() {
        try {
            if (logFileWriter != null) {
                logFileWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

