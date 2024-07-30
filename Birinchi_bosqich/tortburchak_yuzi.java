import javax.swing.*;

public class tortburchak_yuzi {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog(null, "Katet1ni kiriting: ");
        String b = JOptionPane.showInputDialog(null, "Kete2ni kiriting: ");
        double Yuza, gepotenuza;
        int katet1 = Integer.parseInt(a);
        int katet2 = Integer.parseInt(b);
        gepotenuza = Math.sqrt(Math.pow(katet1, 2) + Math.pow(katet2, 2));
        Yuza = (katet1 * katet2) / 2;
        System.out.println("Yuza " + Yuza);
        System.out.println("Gepotenuzasi " + gepotenuza);

    }
}
