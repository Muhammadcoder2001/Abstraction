package For_while_Dowhile;

import java.util.Scanner;

public class if_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sonlarni kiriting: ");

        int a = input.nextInt();
        int b = input.nextInt();
        if(a > b){
            System.out.println(2);
        }
        else {
            System.out.println(1);

        }
        if (a > b){
            System.out.println(a);
            System.out.println(b);
        }
    }
}
