package org.example;

public class FileMaxSizeReachedException extends Exception{

    public FileMaxSizeReachedException(){
        super("Max file size");
    }
}
