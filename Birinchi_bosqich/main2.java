import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Salom bu yerda xabar yoziladi!!!");
        JOptionPane.showMessageDialog(null,
                "Salom bu yerda xabar yoziladi!!!" ,
                "Sarlavha => PLAIN_MESSAGE",
                JOptionPane.PLAIN_MESSAGE );
        JOptionPane.showMessageDialog(null,
                "Salom bu yerda xabar yoziladi!!!" ,
                "Sarlavha => QUESTION_MESSAGE",
                JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,
                "Salom bu yerda xabar yoziladi!!!" ,
                "Sarlavha => WARNING_MESSAGE",
                JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null,
                "Salom bu yerda xabar yoziladi!!!" ,
                "Sarlavha => ERROR_MESSAGE",
                JOptionPane.ERROR_MESSAGE);
    }
}
