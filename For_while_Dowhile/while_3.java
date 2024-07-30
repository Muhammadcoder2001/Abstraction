package For_while_Dowhile;

import java.util.Scanner;

public class while_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Son kiriting: ");
        int num = input.nextInt();
        int i = 0;
        String str = "";

        while (num > 0){
            int res = num % 10;
            str = str + res;
            num /= 10;
        }
        if(str.indexOf("2") != -1) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
