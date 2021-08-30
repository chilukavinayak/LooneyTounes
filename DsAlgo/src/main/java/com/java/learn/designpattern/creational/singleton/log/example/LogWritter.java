package com.java.learn.designpattern.creational.singleton.log.example;

public class LogWritter {

    private static LogWritter logWritter;

    private LogWritter(){}

    public static LogWritter getInstance(){
        if(logWritter == null){
            logWritter = new LogWritter();
        }
        return logWritter;
    }

}
class DriverClass{
    public static void main(String[] args) {
        LogWritter instance1 = LogWritter.getInstance();
        LogWritter instance2 = LogWritter.getInstance();
        System.out.println(instance1 == instance2);
    }
}

