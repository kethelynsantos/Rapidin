package Screens;


import Classes.*;

import javax.swing.*;
import java.util.ArrayList;

public class ChoiceUser extends Frame {
    public ChoiceUser() {
        super("ChoiceUser", "src/Images/choice_user.png");

        // cria um painel para a tela de escolha
        JPanel choicePanel = new JPanel();
        choicePanel.setLayout(null);

        // obtem a lista de ussuarios da classe App
        ArrayList<User> usersList = App.usersList;
        System.out.println(usersList);

        String[] usersOptions = new String[usersList.size()];
        DefaultComboBoxModel<User> model = new DefaultComboBoxModel<>(App.usersList.toArray(new User[0]));
        JComboBox<User> userComboBox = new JComboBox<>(model);
        userComboBox.setBounds(90, 300, 200, 30);

        Button btn_next = new Button();
        btn_next.setBounds(47, 675, 295, 48);
        btn_next.addActionListener(e -> {
            App.user = userComboBox.getItemAt(userComboBox.getSelectedIndex());
            ChoiceRest choiceRest = new ChoiceRest(App.user);
            choiceRest.setVisible(true);
            dispose();
        });

        Button btn_back = new Button();
        btn_back.setBounds(28, 50, 30, 30);
        btn_back.addActionListener(e -> {
            HomeUser homeUser = new HomeUser();
            homeUser.setVisible(true);
            dispose();
        });

        // Adiciona à tela
        getContentPane().add(btn_next);
        getContentPane().add(btn_back);
        getContentPane().add(userComboBox);

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        new ChoiceUser();
    }
}
