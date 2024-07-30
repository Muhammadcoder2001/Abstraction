package For_while_Dowhile;

import java.lang.reflect.Type;
import java.util.Scanner;

public class while_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Son kiriting: ");
        int num = input.nextInt();
        while_4 odd = new while_4();
        String str = "";
        while(num > 0){
             str += num % 10;
            num /=10;
        }
        if(odd.check_odd(str)){
            System.out.println("Toq son bor" );
        }
        else {
            System.out.println("Toq son yo'q");
        }
    }
    public boolean check_odd(String str) {
        int number = Integer.parseInt(str);
        while (number > 0) {
            int res = number % 10;
            if (res % 2 != 0) {
                return  true;
            }
            number /= 10;
        }
        return  false;
    }
}
