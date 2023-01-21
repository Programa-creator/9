package org.example;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class FileLogger {

    public FileLoggerConfiguration config;
    public FileLogger(FileLoggerConfiguration c){
        config = c;
    }

    public void debug(String str) throws Exception{
        File file = new File(config.file);
        if(!file.exists()){
            file.createNewFile();
        }
        if(file.length() >= config.MaxSize){
            throw new FileMaxSizeReachedException();
        }
        FileWriter writer = new FileWriter(file);
        String now = LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss"));
        String result = "[" + now + "][DEBUG] Message: " + str + "\n";
        writer.append(result);
        writer.close();
    }
    public void info(String str) throws Exception{
        File file = new File(config.file);
        if(!file.exists()){
            file.createNewFile();
        }
        if(file.length() >= config.MaxSize){
            throw new FileMaxSizeReachedException();
        }
        FileWriter writer = new FileWriter(file);
        String now = LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss"));
        String result = "[" + now + "][INFO] Message: " + str + "\n";
        writer.append(result);
        writer.close();
    }

    public static enum LoggingLevel{
        INFO,DEBUG
    }

}
