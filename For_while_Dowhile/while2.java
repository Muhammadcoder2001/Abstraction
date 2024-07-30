package For_while_Dowhile;

import java.util.Scanner;

public class while2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sonni kiriting: ");
        int n = input.nextInt();
        while2 prime = new while2();
        if (prime.is_Prime(n)){
            System.out.println("Tub");
        }
        else{
            System.out.println("Tub emas");
        }
    }

    public boolean is_Prime(int number){
        int i = 2;
        while (i <= number /2){
            if (number % i == 0){
                return false;
            }
            i++;
        }
        return  true;
    }
}
