package Label;

import javax.swing.*;
import java.awt.*;

public class label_frame extends JFrame {
    JLabel label1;
    JLabel label2;
    public label_frame(){
        super("JLabel bilan tanishish");
        setLayout(new FlowLayout());
        label1 = new JLabel("Konstruktor orqali yozish");
        label1.setToolTipText("Bu label1");
        add(label1);

        Icon rasm  = new ImageIcon(getClass().getResource("image.jpeg"));
        JLabel label2 = new JLabel("Rasm bilan ", rasm, SwingConstants.LEFT);
        label2.setToolTipText("Bu label2");
        add(label2);
    }


}
