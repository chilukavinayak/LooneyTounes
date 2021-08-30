package com.java.learn.designpattern.creational.singleton.db_thread_safe.example;

public class DBConnection_LessOptimal {

    static private DBConnection_LessOptimal instance;

    private DBConnection_LessOptimal(){}

    // in multi-thread application below code impacts because only one thread has to access at a time.
    public synchronized static DBConnection_LessOptimal getInstance(){

        synchronized (instance){
            if(instance == null){
                instance = new DBConnection_LessOptimal();
            }
        }

        return instance;
    }
}
