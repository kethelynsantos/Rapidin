package Screens;

import javax.swing.*;
import java.awt.*;

public class Start extends JFrame {
    public Start() {
        super("Rapidin");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 390, 844);

        // Cria um painel principal para conter a imagem de fundo
        JPanel mainPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon icon = new ImageIcon("src/Images/start.png");
                Image image = icon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };

        // Define um layout nulo para posicionar manualmente os componentes
        mainPanel.setLayout(null);

        JButton btn_start = new JButton();
        btn_start.setBounds(90, 685, 193, 48);
        btn_start.setOpaque(false);
        btn_start.setContentAreaFilled(false);
        btn_start.setBorderPainted(false);

        btn_start.addActionListener(e -> {
            Home home = new Home();
            home.setVisible(true);
            dispose(); // fecha a tela Start
        });

        // Adiciona o botão ao painel principal
        mainPanel.add(btn_start);

        // Define o painel principal como conteúdo da janela
        setContentPane(mainPanel);

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        new Start();
    }
}
