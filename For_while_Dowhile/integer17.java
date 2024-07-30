package For_while_Dowhile;

import java.util.Scanner;

public class integer17 {
    public static void main(String[] args) {
        Scanner kiritish = new Scanner(System.in);
        int num =kiritish.nextInt();
        int qoldiq = num % 1000;
        int butun = num / 1000;
        System.out.println(butun);
        System.out.println(qoldiq);
    }
}
