package For_while_Dowhile;

import javax.swing.*;

public class Integer_class {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog(null, "Sonni kiriting: ");
        int num = Integer.parseInt(a);
        int result = num / 100;
        System.out.println(result + " metr");
    }
}
