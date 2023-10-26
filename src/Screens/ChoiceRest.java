package Screens;


import Classes.*;

import javax.swing.*;
import java.util.ArrayList;

public class ChoiceRest extends Frame {
    public ChoiceRest(User selectedUser) {
        super("ChoiceRest", "src/Images/choice_rest.png");

        App.user = selectedUser;

        // cria um painel para a tela de escolha
        JPanel choicePanel = new JPanel();
        choicePanel.setLayout(null);

        // obtem a lista de restaurantes da classe App
        ArrayList<Restaurant> restaurantList = App.restaurantList;
        System.out.println(restaurantList);

        String[] restaurantOptions = new String[restaurantList.size()];
        DefaultComboBoxModel<Restaurant> model = new DefaultComboBoxModel<>(App.restaurantList.toArray(new Restaurant[0]));
        JComboBox<Restaurant> restaurantComboBox = new JComboBox<>(model);
        restaurantComboBox.setBounds(90, 300, 200, 30);

        Button btn_next = new Button();
        btn_next.setBounds(47, 675, 295, 48);
        btn_next.addActionListener(e -> {
            App.restaurant = restaurantComboBox.getItemAt(restaurantComboBox.getSelectedIndex());
            ChoiceFood choiceFood = new ChoiceFood(App.restaurant, App.user);
            choiceFood.setVisible(true);
            dispose();
        });

        Button btn_back = new Button();
        btn_back.setBounds(28, 50, 30, 30);
        btn_back.addActionListener(e -> {
            ChoiceUser choiceUser = new ChoiceUser();
            choiceUser.setVisible(true);
            dispose();
        });

        // Adiciona à tela
        getContentPane().add(btn_next);
        getContentPane().add(btn_back);
        getContentPane().add(restaurantComboBox);

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        new ChoiceRest(App.user);
    }
}
