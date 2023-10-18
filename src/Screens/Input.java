package Screens;

import javax.swing.*;
import java.awt.*;

public class Input extends JTextField {
    public Input() {
        setOpaque(false);
        setBackground(Color.blue);
//        setBorder(false);
        setVisible(true);
        setForeground(Color.WHITE); // Define a cor da fonte
        setFont(new Font("Sora", Font.BOLD, 18));
    }
}
