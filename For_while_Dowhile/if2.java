package For_while_Dowhile;

import java.util.Scanner;

public class if2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sonni kiriting: ");
        int x = input.nextInt();
        if (x > 0){
            x += 1;
            System.out.println(x);
        }
        else{
            x -=2;
            System.out.println(x);
        }
    }
}
