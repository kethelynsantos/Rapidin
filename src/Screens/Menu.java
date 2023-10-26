package Screens;


import Classes.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Menu extends Frame {

    public Menu(Restaurant selectedRestaurant) {
        super("Menu", "src/Images/menu.png");

        System.out.println("restaurante selecionado: " + selectedRestaurant);

        Button btn_back = new Button();
        btn_back.setBounds(28, 50, 30, 30);
        btn_back.addActionListener(e -> {
            Choice choice = new Choice();
            choice.setVisible(true);
            dispose();
        });

        // cria a tabela
        JTable table = new JTable();

        // cria um modelo de tabela
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nome do Prato");
        model.addColumn("Preço");

        // obtem a lista de pratos do restaurante selecionado
        ArrayList<Dish> dishList = selectedRestaurant.getFoods();

        // adiciona as linhas da tabela com os pratos
        for (Dish dish : dishList) {
            model.addRow(new Object[]{dish.getName(), dish.getPrice()});
        }

        table.setModel(model);

        // Adicione a tabela à tela
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(45, 283, 300, 400);
        getContentPane().add(scrollPane);

        // Adicione o botão à tela
        getContentPane().add(btn_back);

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }
}
