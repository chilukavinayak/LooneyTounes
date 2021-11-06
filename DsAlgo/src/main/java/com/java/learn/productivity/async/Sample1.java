package com.java.learn.productivity.async;

import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

import static java.lang.Thread.sleep;

public class Sample1 {
    private static int MAX = 5;
    private static CountDownLatch latch = new CountDownLatch(MAX);
    public static String readResponse(int id) throws Exception {
        try {
            System.out.println("making request " + id + "from " + Thread.currentThread());
            URL url = new URL("http://httpstat.us/200?sleep=5000");
            String response = new Scanner(url.openStream()).nextLine();
            System.out.println("received response " +id + "from "+ Thread.currentThread());
            return response;
        } catch (Exception e) {
            return e.getMessage();
        }
        finally {
            sleep(10000);
            latch.countDown();
        }
    }

    public static void main(String[] args) throws Exception {
        for(int i=0;i<MAX;i++){
            int index = i;
            new Thread(() -> {
                try {
                    readResponse(index);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
        latch.await();
    }
}
