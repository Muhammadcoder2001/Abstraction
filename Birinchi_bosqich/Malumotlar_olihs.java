import javax.swing.*;
import java.time.Year;

public class Malumotlar_olihs {
    public static void main(String[] args) {
        String ism = JOptionPane.showInputDialog("Ismingizni kiriting: ");
        String t_yil = JOptionPane.showInputDialog("Tug'ilgan yilingizni Kiriting: ");
        int yil = Year.now().getValue();
        int t_yili = Integer.parseInt(t_yil);
        int yosh = yil - t_yili;
        String xabar = ism + " Siz " + yosh + " yoshdasiz ";

        System.out.println(xabar);
        JOptionPane.showInputDialog(null, xabar,
                "Muxim xabar",
                JOptionPane.WARNING_MESSAGE
                );
    }
}