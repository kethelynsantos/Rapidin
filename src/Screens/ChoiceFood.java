package Screens;

import Classes.*;

import javax.swing.*;
import java.util.ArrayList;

public class ChoiceFood extends Frame {
    private ArrayList<Dish> selectedDishes = new ArrayList<>(); // Lista temporária para armazenar os pratos selecionados
    public ChoiceFood(Restaurant selectedRestaurant, User user) {
        super("ChoiceFood", "src/Images/choice_food.png");

        // cria um painel para a tela de escolha
        JPanel choicePanel = new JPanel();
        choicePanel.setLayout(null);

        // obtem a lista de pratos do restaurante selecionado
        ArrayList<Dish> dishesList = selectedRestaurant.getFoods();

        String[] disheOptions = new String[dishesList.size()];
        DefaultComboBoxModel<Dish> model = new DefaultComboBoxModel<>(dishesList.toArray(new Dish[0]));
        JComboBox<Dish> dishComboBox = new JComboBox<>(model);
        dishComboBox.setBounds(90, 300, 200, 30);

        Button btn_add = new Button();
        btn_add.setBounds(271, 671, 61, 61);
        btn_add.addActionListener(e -> {
            Dish selectedDish = dishComboBox.getItemAt(dishComboBox.getSelectedIndex());
            selectedDishes.add(selectedDish); // Adiciona o prato selecionado à lista temporária
        });

        Button btn_confirm = new Button();
        btn_confirm.setBounds(57, 678, 185, 48);
        btn_confirm.addActionListener(e -> {
            Dish selectedDish = dishComboBox.getItemAt(dishComboBox.getSelectedIndex());
            ChoiceOrder choiceOrder = new ChoiceOrder(selectedDish);
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

        // Adiciona o botão à tela
        getContentPane().add(btn_add);
        getContentPane().add(btn_back);
        getContentPane().add(btn_confirm);
        getContentPane().add(dishComboBox);

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        new ChoiceFood(App.restaurant, App.user);
    }
}
