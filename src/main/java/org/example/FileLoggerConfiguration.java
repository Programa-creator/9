package org.example;
import static org.example.FileLogger.LoggingLevel;

public class FileLoggerConfiguration {

    public String file = "file.txt";

    public LoggingLevel level = LoggingLevel.DEBUG;

    public int MaxSize = 10000;

    public String format = "txt";


}
