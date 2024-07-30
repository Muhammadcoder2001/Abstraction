import javax.swing.*;

public class Teng_tomonli_uchburchak {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog(null, "Uchburchakning tomonini kiriting: ");
        int tomon = Integer.parseInt(a);
        double S;
        S = Math.sqrt(3) / 4 * Math.pow(tomon, 2);
        System.out.println("Teng tomonli uchburchakning yuzi " + S + " ga teng");
    }
}
