package com.java.learn.dsalgo.recusion.arrays.arrays;

public class Program5_LastIndex {
    public static void main(String[] args) {
        int[] arry = {15,11,40,4,4,9};
        int x = 4;
        int li = lastIndex(arry,x, 0);
        if(li == -1)
            System.out.println("Element not found");
        else
            System.out.println(li);

        li = lastIndex1(arry,x, arry.length-1);
        if(li == -1)
            System.out.println("Element not found");
        else
            System.out.println(li);


    }

    private static int lastIndex(int[] arry, int x, int i) {

        if(i >= arry.length)
            return -1;

        int cli = lastIndex(arry,x,i+1);
        if(cli != -1)
            return cli;
        else if(arry[i] == x)
            return i;
        else
            return -1;

    }

    private static int lastIndex1(int[] arry, int x, int i){
        if(i < 0)
            return -1;

        if(arry[i] == x)
            return i;

        return lastIndex(arry,x,i-1);
    }


}
