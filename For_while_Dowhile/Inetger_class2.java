package For_while_Dowhile;

import javax.swing.*;

public class Inetger_class2 {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog(null, "Kilogramni kiriting: ");
        int kg = Integer.parseInt(a);
        int result = kg / 1000;
        System.out.println("Butun tonna qiymati " + result+ " Tonna");
    }
}
