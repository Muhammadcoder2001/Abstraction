package For_while_Dowhile;

import java.util.Scanner;

public class File_hajmi {
    public static void main(String[] args) {
        System.out.println("Baytlarni kiriting: ");
        Scanner kiritish = new Scanner(System.in);

        int file_hajm = kiritish.nextInt();
        int result = file_hajm / 1024;
        System.out.println("File hajmi " + result + "KB ga teng ");
    }
}
