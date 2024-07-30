import javax.swing.*;

public class Orta_arifmetik {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog(null,  "Son1 ni kiriting: ");
        String b = JOptionPane.showInputDialog(null, "Son2ni kiriting: ");
        int son1 = Integer.parseInt(a);
        int son2 = Integer.parseInt(b);
        double arif , georif;
        arif = (son1 + son2) / 2;
        georif = Math.sqrt(son1 * son2);
        System.out.println("O'rta arifmetig " + arif);
        System.out.println("O'rta geoarifmetigi "  + georif);

    }
}
