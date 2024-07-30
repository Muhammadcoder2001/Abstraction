package For_while_Dowhile;

import java.util.Scanner;

public class num_convetr {
    public static void main(String[] args) {
        Scanner kiritish = new Scanner(System.in);
        System.out.println("Raqamni kiriting: ");
        int num =kiritish.nextInt();
        int birlar = num % 10;
        int onlar = num /10 % 10;
        int yuzlar = num / 100;
        int result = onlar * 100 + yuzlar * 10 + birlar;
        System.out.println(result);
    }
}
