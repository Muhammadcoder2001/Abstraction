package For_while_Dowhile;

import java.util.Scanner;

public class ifga_doir1 {
    public static void main(String[] args) {
        Scanner kiritish = new Scanner(System.in);
        System.out.println("Sooni kiriting: ");
        int x = kiritish.nextInt();
        if (x > 0){
            x += 1;
            System.out.println("Kiritgan raqamingiz juft bo'lgani uchun raqamga bir qo'shib qo'yildi  "+x);
        }
        else{
            System.out.println(x);
        }
    }
}
