import java.util.Scanner;

public  class String_class{
    public static void main(String[] args) {
        Scanner num = new Scanner (System.in);
        System.out.println("Santimetrlarda kiriting : " );
        int a = num.nextInt();
        int result = a / 100;
        System.out.println(result + " " + "Metr");
    }
}