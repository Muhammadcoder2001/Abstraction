package For_while_Dowhile;

import javax.swing.*;

public class home_task9 {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog(null, "To'rtburchakning birinchi tomonini kiriting: ");
        String b = JOptionPane.showInputDialog(null, "To'rtburchakning ikkinchi tomonini kiriting: ");

        int tomon1 = Integer.parseInt(a);
        int tomon2 = Integer.parseInt(b);

        int result = tomon1 * tomon2;
        System.out.println("To'rtburchakning maydoni: " + result);


    }
}
