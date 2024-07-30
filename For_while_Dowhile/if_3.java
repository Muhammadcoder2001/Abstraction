package For_while_Dowhile;

import java.util.Scanner;

public class if_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        if (x > 0){
            x +=1;
            System.out.println(x);
        } else if (x < 0) {
            x -= 2;
            System.out.println(x);
        }
        else{
            x = 10;
            System.out.println(x);
        }
    }
}
