package For_while_Dowhile;

import java.util.Scanner;

public class year_yuzlik {
    public static void main(String[] args) {
        Scanner kiritish = new Scanner(System.in);
        System.out.println("Yilni kirting: ");
        int year = kiritish.nextInt();
        int result = year / 100 + 1;
        System.out.println("Yuzlik = " + result);
    }
}
