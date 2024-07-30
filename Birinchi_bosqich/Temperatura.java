import javax.swing.*;

public class Temperatura {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog(null, "Enter temp1");
        String b = JOptionPane.showInputDialog(null, "Enter temp2");
        String c = JOptionPane.showInputDialog(null, "Enter Hajm1");
        String d = JOptionPane.showInputDialog(null, "Enter Hajm2");

        int temp1 = Integer.parseInt(a);
        int temp2 = Integer.parseInt(b);
        double v1 = Integer.parseInt(c);
        double v2 = Integer.parseInt(d);

        double temp, V;
        temp =((v1 + v2) * temp2 + v1 * temp1) / 2 * v1 + v2;
        V = v1 + v2;
        System.out.println("Suvning Hajmi "+ V+ " ga teng");
        System.out.println("Tempertaurasi " + temp);


    }
}
