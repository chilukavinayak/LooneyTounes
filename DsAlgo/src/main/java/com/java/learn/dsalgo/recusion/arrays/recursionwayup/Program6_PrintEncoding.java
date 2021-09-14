package com.java.learn.dsalgo.recusion.arrays.recursionwayup;

import java.util.Scanner;

public class Program6_PrintEncoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printEncoding(str,"");
    }



    private static void printEncoding(String str, String asf) {

        if(str.isEmpty()){
            System.out.println(asf);
            return;
        }


        char ch = str.charAt(0);
        String ros = str.substring(1);
        int code = ch - '0';
        char encode = (char)('a' + code - 1);
        if(ch != '0')
            printEncoding(ros,asf+encode);


        if(str.length() > 1) {
            String ch2 = str.substring(0, 2);
            String ros1 = str.substring(2);
            int code1 = Integer.parseInt(ch2);
            if (code1 >= 10 && code1 <= 26) {
                char encode1 = (char) ('a' + code1 - 1);
                printEncoding(ros1, asf + encode1);
            }
        }

    }
}
