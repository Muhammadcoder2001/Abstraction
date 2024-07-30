package Birinchi_bosqich;

import java.util.ArrayList;

public class String_exercise {
    public static void main(String[] args) {
        String str = "zaz";
        int result = 0;
//        int current_num = 0;
        for (int i = 0; i < str.length()-1; i ++){
            int current_num  =Math.abs(str.charAt(i)- str.charAt(i +1));
            result += current_num;
            System.out.println(result);
        }
    }
}
