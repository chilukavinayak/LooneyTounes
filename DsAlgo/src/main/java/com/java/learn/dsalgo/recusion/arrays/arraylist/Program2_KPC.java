package com.java.learn.dsalgo.recusion.arrays.arraylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program2_KPC {
   static Map<Character,String>  km= new HashMap<>();

    public static void main(String[] args) {
        km.put('0',".;");
        km.put('1',"abc");
        km.put('2',"def");
        km.put('3',"ghi");
        km.put('4',"jkl");
        km.put('5',"mno");
        km.put('6',"pqrs");
        km.put('7',"tu");
        km.put('8',"vwx");
        km.put('9',"yz");

        List<String> list = getKPC("123");
    //    list.forEach(s -> System.out.print(s + ", "));

        list = getKPC("78");
        System.out.println(String.join(", ",list));

        list = getKPC("789");
        System.out.println(String.join(", ",list));
    }

    private static List<String> getKPC(String keysPressed) {
        if(keysPressed.isEmpty()){
            List<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char c = keysPressed.charAt(0);
        String ros = keysPressed.substring(1);
        List<String> result = getKPC(ros);

        List<String> ans = new ArrayList<>();
        String pkeys= km.get(c);
        for(char pkey : pkeys.toCharArray()){
            for (String s : result) {
                ans.add(pkey+s);
            }
        }

        return ans;
    }

    //123
    private static List<String> getKPC_v2(String keysPressed) {
        if(keysPressed.isEmpty()){
            List<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char ch = keysPressed.charAt(0);
        String ros = keysPressed.substring(1);

        List<String> rres = getKPC_v2(ros);

        List<String> mres = new ArrayList<>();

        String options = km.get(ch);

        for(char op: options.toCharArray()){
            mres.addAll(rres.stream().map(s -> op+s).collect(Collectors.toList()));
        }

        return mres;
    }

}
