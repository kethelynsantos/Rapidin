package Screens;


import Classes.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Menu extends Frame {
    private final Restaurant selectedRestaurant;

    public Menu(Restaurant selectedRestaurant) {
        super("Menu", "src/Images/menu.png");
        this.selectedRestaurant = selectedRestaurant;

        Button btn_back = new Button();
        btn_back.setBounds(28, 50, 30, 30);
        btn_back.addActionListener(e -> {
            HomeUser homeUser = new HomeUser();
            homeUser.setVisible(true);
            dispose();
        });

        // Crie a tabela
        JTable table = new JTable();

        // Crie um modelo de tabela
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nome do Prato");
        model.addColumn("Preço");

        // Obtenha a lista de pratos do restaurante selecionado
        ArrayList<Food> foodList = Restaurant.getFoods();

        // Adicione as linhas da tabela com os pratos
        for (Food food : foodList) {
            model.addRow(new Object[]{food.getName(), food.getPrice()});
        }

        table.setModel(model);

        // Adicione a tabela à tela
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(50, 100, 300, 400);
        getContentPane().add(scrollPane);

        // Adicione o botão à tela
        getContentPane().add(btn_back);

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

}
