package Classes;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Input extends JTextField {
    public Input() {
        setOpaque(false);
        setBorder(BorderFactory.createLineBorder(Color.white, 0));
        setVisible(true);
        setForeground(Color.WHITE); // Define a cor da fonte
        setFont(new Font("Sora", Font.BOLD, 15));
    }

}
