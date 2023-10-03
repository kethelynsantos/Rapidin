package Screens;

import javax.swing.*;
import java.awt.*;

public class Home extends JFrame{
    public Home() {
        super("Rapidin");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 390, 844);

        // Cria um painel principal para conter a imagem de fundo
        JPanel mainPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon icon = new ImageIcon("src/Images/home.png");
                Image image = icon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };

        // Define um layout nulo para posicionar manualmente os componentes
        mainPanel.setLayout(null);

        JButton btn_rest = new JButton();
        btn_rest.setBounds(22, 549, 96, 95);
        btn_rest.setOpaque(false);
        btn_rest.setContentAreaFilled(false);
        btn_rest.setBorderPainted(false);

        btn_rest.addActionListener(e -> {
            Home home = new Home();
            home.setVisible(true);
            dispose(); // fecha a tela Home
        });

        JButton btn_user = new JButton();
        btn_user.setBounds(22 + 96 + 27, 549, 96, 95);
//        btn_user.setOpaque(false);
//        btn_user.setContentAreaFilled(false);
//        btn_user.setBorderPainted(false);

        JButton btn_order = new JButton();
        btn_order.setBounds(22 + 96 + 27 + 96 + 27, 549, 96, 95);
//        btn_order.setOpaque(false);
//        btn_order.setContentAreaFilled(false);
//        btn_order.setBorderPainted(false);

        // Adicione todos os botões ao painel principal
        mainPanel.add(btn_rest);
        mainPanel.add(btn_user);
        mainPanel.add(btn_order);

        // Define o painel principal como conteúdo da janela
        setContentPane(mainPanel);

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        new Home();
    }
}
