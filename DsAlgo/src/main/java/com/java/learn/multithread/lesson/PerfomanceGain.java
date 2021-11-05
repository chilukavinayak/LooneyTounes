package com.java.learn.multithread.lesson;

public class PerfomanceGain {

    static class Summation{
        private long start;
        private long end;

        public Summation(long start, long end){
            this.start = start;
            this.end = end;
        }

        public long add(){
            long result =0;
            for(long i=start;i<=end;i++){
                result += i;
            }
            return result;
        }

    }

    public static void main(String[] args) throws Exception {
        long result1 = singleThread();
        long result2 = DualThread();
        if(result1>result2){
            System.out.println("Single Thread won::"+result1);
        }
        else
            System.out.println("Dual Threaded won::"+result2);
    }

    private static long DualThread() throws Exception{
        Summation s1 = new Summation(1, Integer.MAX_VALUE/2-1);
        Summation s2 = new Summation(Integer.MAX_VALUE, Integer.MAX_VALUE);
        long start = System.currentTimeMillis();
        Thread t1 = new Thread(()->{
            s1.add();
        });
        Thread t2 = new Thread(()->{
            s2.add();
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        long end = System.currentTimeMillis();
        return end;
    }

    private static long singleThread() {
        Summation s = new Summation(1, Integer.MAX_VALUE);
        long start = System.currentTimeMillis();
        s.add();
        long end = System.currentTimeMillis();
        return (end-start);
    }


}
