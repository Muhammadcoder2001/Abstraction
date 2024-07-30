import java.util.Scanner;

public class clearly_division {
    public static void main(String[] args) {
        float a, b, natija;
        Scanner kiritsh =new Scanner(System.in);
        System.out.println("Son kiriting: ");
        a = kiritsh.nextFloat();
        b = kiritsh.nextFloat();
        natija = a / b;
        System.out.printf("%.1f" , natija);
    }
}
