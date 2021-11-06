package com.java.learn.productivity.async;

public class Sample {

    public static void nap() {
        try{
            Thread.sleep(500000);
        } catch (Exception e) {

        }

    }
    public static void main(String[] args) throws Exception {
        int MAX = 100000000;
        Thread thread = null;

        for(int i=0;i<MAX;i++){
            thread = new Thread(Sample::nap);
            thread.start();
        }
        System.out.println("Started "+ MAX + " threads");
        thread.join();
        System.out.println("done");
    }


}
