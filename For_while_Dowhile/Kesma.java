package For_while_Dowhile;

import java.util.Scanner;

public class Kesma {
    public static void main(String[] args) {
        Scanner kiritish = new Scanner(System.in);
        System.out.println("A kesmani kiriting: ");
        int a = kiritish.nextInt();
        System.out.println("B  kesmani kiriting: ");
        int b = kiritish.nextInt();

        int result = a / b;
        System.out.println("A kesmada b kesmangiz " + result + "Marta takrorlangan");
    }
}
