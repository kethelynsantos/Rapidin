package Screens;

import Classes.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Objects;

public class ChoiceFood extends Frame {
    private ArrayList<Dish> selectedDishes = new ArrayList<>();

    public void addSelectedDish(Dish dish) {
        selectedDishes.add(dish);
    }

    public ArrayList<Dish> getSelectedDishes() {
        return selectedDishes;
    }

    public ChoiceFood(Restaurant selectedRestaurant, User user) {
        super("ChoiceFood", "src/Images/choice_food.png");

        // cria um painel para a tela de escolha
        JPanel choicePanel = new JPanel();
        choicePanel.setLayout(null);

        // obtem a lista de pratos
        ArrayList<Dish> dishesList = selectedRestaurant.getFoods();

        DefaultComboBoxModel<Dish> model = new DefaultComboBoxModel<>(dishesList.toArray(new Dish[0]));
        JComboBox<Dish> dishComboBox = new JComboBox<>(model);
        dishComboBox.setBounds(90, 300, 200, 30);

        Button btn_add = new Button();
        btn_add.setBounds(271, 671, 61, 61);
        btn_add.addActionListener(e -> {
            Dish selectedDish = dishComboBox.getItemAt(dishComboBox.getSelectedIndex());
            addSelectedDish(selectedDish);
            Order order = new Order(selectedDish, user, selectedRestaurant);

            App.registerOrder(order);
            JOptionPane.showMessageDialog(ChoiceFood.this, "Prato adicionado ao pedido com sucesso!", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        });

        Button btn_confirm = new Button();
        btn_confirm.setBounds(57, 678, 185, 48);
        btn_confirm.addActionListener(e -> {
            Dish selectedDish = dishComboBox.getItemAt(dishComboBox.getSelectedIndex());
            Order order = new Order(selectedDish, user, selectedRestaurant);
            App.registerOrder(order);

            ArrayList<Dish> selectedDishes = getSelectedDishes();
            ChoiceOrder choiceOrder = new ChoiceOrder(App.getOrdersList(), selectedDishes); // Passe a lista para ChoiceOrder
            choiceOrder.setVisible(true);
            dispose();
        });

        Button btn_back = new Button();
        btn_back.setBounds(28, 50, 30, 30);
        btn_back.addActionListener(e -> {
            ChoiceRest choiceRest = new ChoiceRest(user);
            choiceRest.setVisible(true);
            dispose();
        });

        getContentPane().add(btn_add);
        getContentPane().add(btn_back);
        getContentPane().add(btn_confirm);
        getContentPane().add(dishComboBox);

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

}