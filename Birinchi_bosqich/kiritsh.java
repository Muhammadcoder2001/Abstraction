import javax.swing.*;

public class kiritsh {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog(null, "Kubning qirrasini kiriting: ",
                "Input",
                JOptionPane.PLAIN_MESSAGE);
        double S , V;
       int b= Integer.parseInt(a);
       V = Math.pow(b, 3);
       S =6  *  Math.pow(b, 2) ;
        System.out.println(S);
        System.out.println("Cube of "+ b + " " + V + " cube");

    }
}
