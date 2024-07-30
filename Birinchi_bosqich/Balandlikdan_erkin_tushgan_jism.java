import javax.swing.*;

public class Balandlikdan_erkin_tushgan_jism {
    public static void main(String[] args) {
        String balandlik = JOptionPane.showInputDialog(null, "Balandlikni kiriting: ");
        int g = 10;
        int h = Integer.parseInt(balandlik);
        double t;
        t = Math.sqrt((2 * h) / g);
        System.out.println(t);
    }
}
