package For_while_Dowhile;

import java.util.Scanner;

public class pass_sekund {
    public static void main(String[] args) {
        Scanner kiritish = new Scanner(System.in);
        int sekund = kiritish.nextInt();
        int result = sekund / 60;
        int result2 = sekund / 60 / 60;
        System.out.println("Kun boshlangandan beri " + result2 + " Soat o'tdi");
        System.out.println("Kun boshlangandan beri " + result + " Minut O'tdi");

    }
}
