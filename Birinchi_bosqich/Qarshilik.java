import javax.swing.*;

public class Qarshilik {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog(null, "Qarshilik1ni kiriting: ");
        String b = JOptionPane.showInputDialog(null, "Qarshilikni kiriting: ");
        String c = JOptionPane.showInputDialog(null, "Qarshilik3ni kiriting: ");

        int R1 = Integer.parseInt(a);
        int R2 = Integer.parseInt(b);
        int R3 = Integer.parseInt(c);

        double R;
        R = (R1 * R2 * R3) / (R1 * R2 + R1 * R3 + R2 * R3);
        System.out.println("Ummumiy qarshilik " + R);


    }
}
