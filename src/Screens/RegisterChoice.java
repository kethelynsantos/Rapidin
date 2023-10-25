package Screens;


import Classes.Button;
import Classes.Frame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterChoice extends Frame {
    public RegisterChoice() {
        super("Rapidin", "src/Images/choice_rest.png");

        Button btn_next = new Button();
        btn_next.setBounds(47, 675, 295, 48);
        btn_next.addActionListener(e -> {
            RegisterOrder registerOrder = new RegisterOrder();
            registerOrder.setVisible(true);
            dispose();
        });

        Button btn_back = new Button();
        btn_back.setBounds(28, 50, 30, 30);
        btn_back.addActionListener(e -> {
            HomeRest homeRest = new HomeRest();
            homeRest.setVisible(true);
            dispose();
        });

        // Adiciona à tela
        getContentPane().add(btn_next);
        getContentPane().add(btn_back);

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        new RegisterChoice();
    }
}
