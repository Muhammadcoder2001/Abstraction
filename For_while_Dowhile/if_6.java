package For_while_Dowhile;

import java.util.Scanner;

public class if_6 {
    public static void main(String[] args) {
    int a = 9, b =8 , c = 7;
    if (a < b && a < c){
        System.out.println("Min " + a);
    }
    else if (b < a && b < c){
        System.out.println("Min " + b);
    }
    else if (c < a && c < b) {
        System.out.println("Min " + c);
    }
    }
}
