package com.java.learn.designpattern.creational.singleton.db_thread_safe.example;

public class DBConnection {

    static private DBConnection instance;

    private DBConnection(){}

    public static DBConnection getInstance(){

        if(instance == null){
            synchronized (instance){
                synchronized (instance){
                    if(instance == null){
                        instance = new DBConnection();
                    }
                }
            }
        }

        return instance;
    }
}
