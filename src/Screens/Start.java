package Screens;

import javax.swing.*;
import java.awt.*;

public class Start extends JFrame {
    public Start() {
        super("Rapidin");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 390, 844);

        ImageIcon icon = new ImageIcon("src/Images/start.png");
        JLabel label = new JLabel(icon);
        Button btn_start = new Button("btn_start");
        btn_start.setLocation(93, 719);
        btn_start.addActionListener(e -> );
        add(label);
        setVisible(true);
        setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        new Start();
    }

}
