package org.example;

public class Main {
    public static void main(String[] args) throws Exception {
        FileLoggerConfiguration configuration = new FileLoggerConfiguration();
        FileLogger fileLogger = new FileLogger(configuration);

        fileLogger.debug("Good");
    }
}