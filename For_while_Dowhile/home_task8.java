package For_while_Dowhile;

import java.util.Scanner;

public class home_task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of farenheit: ");
        int farenheit = input.nextInt();
        double celcius = (farenheit - 32) * 5 / 9;
        System.out.println(celcius);
    }
}
