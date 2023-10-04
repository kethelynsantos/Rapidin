package Screens;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    public Frame(String title, String backgroundImagePath) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 390, 844);

        JPanel mainPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon icon = new ImageIcon(backgroundImagePath);
                Image image = icon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };

        mainPanel.setLayout(null);
        setContentPane(mainPanel);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}

