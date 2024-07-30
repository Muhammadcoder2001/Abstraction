package For_while_Dowhile;

import java.util.Scanner;

public class week_days {
    public static void main(String[] args) {
        Scanner kiritish = new Scanner(System.in);
        int k = kiritish.nextInt();
        int result = k % 6;
        switch (result) {
            case 0:
                System.out.println("Yakshanba");
                break;
            case 1:
                System.out.println("Dushanba");
                break;
            case 2:
                System.out.println("Seshanba");
                break;
            case 4:
                System.out.println("Chorshanba");
                break;
            case 5:
                System.out.println("Payshanba" );
                break;
            case 6:
                System.out.println("SHanba");
                break;
            default:
                System.out.println("Bunday xafta kuni mavjud emas!!!");
        }
    }
}
