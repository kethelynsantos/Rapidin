package Screens;


import Classes.Button;
import Classes.Frame;
import Classes.App;
import Classes.Restaurant;
import javax.swing.*;
import java.util.ArrayList;

public class RegisterChoice extends Frame {
    public RegisterChoice() {
        super("RegisterChoice", "src/Images/choice_rest.png");

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

        // adiciona à tela
        getContentPane().add(btn_next);
        getContentPane().add(btn_back);
        getContentPane().add(restaurantComboBox);

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        new RegisterChoice();
    }
}
