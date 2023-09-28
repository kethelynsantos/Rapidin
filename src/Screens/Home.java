package Screens;

import javax.swing.*;

public class Home extends JFrame{
    public Home() {
        super("Image Display");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 390, 844);

        ImageIcon icon = new ImageIcon("src/Images/home.png");
        JLabel label = new JLabel(icon);
        add(label);
        setVisible(true);
        setLocationRelativeTo(null);


    }

    public static void main(String[] args) {
        new Home();
    }
}
