package Screens;

import Classes.*;
import Classes.Button;
import Classes.Frame;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class ChoiceOrder extends Frame {
    private DefaultTableModel selectedDishesModel;
    private JTable selectedDishesTable;
    private JLabel totalLabel;

    public ChoiceOrder(ArrayList<Order> orders, ArrayList<Dish> selectedDishes) {
        super("ChoiceOrder", "src/Images/choice_order.png");

        selectedDishesModel = new DefaultTableModel();
        selectedDishesModel.addColumn("Prato");
        selectedDishesModel.addColumn("Preço");

        selectedDishesTable = new JTable(selectedDishesModel);
        JScrollPane scrollPane = new JScrollPane(selectedDishesTable);
        scrollPane.setBounds(45, 183, 300, 400);
        getContentPane().add(scrollPane);

        totalLabel = new JLabel("R$ 0.00");
        totalLabel.setBounds(126, 597, 98, 33);
        totalLabel.setForeground(Color.WHITE);
        totalLabel.setFont(totalLabel.getFont().deriveFont(18f));
        getContentPane().add(totalLabel);


        Button btn_confirm = new Button();
        btn_confirm.setBounds(47, 675, 295, 48);
        btn_confirm.addActionListener(e -> {
            ChoiceOk choiceOk = new ChoiceOk();
            choiceOk.setVisible(true);
            dispose();
        });

        Button btn_back = new Button();
        btn_back.setBounds(28, 50, 30, 30);
        btn_back.addActionListener(e -> {
            ChoiceFood choiceFood = new ChoiceFood(App.restaurant, App.user);
            choiceFood.setVisible(true);
            dispose();
        });

        getContentPane().add(btn_confirm);
        getContentPane().add(btn_back);

        updateTotal();

        ArrayList<Dish> dishList = App.restaurant.getDishesList();

        for (Dish dish : selectedDishes) {
            selectedDishesModel.addRow(new Object[]{dish.getName(), dish.getPrice()});
        }

        updateTotal();

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void updateTotal() {
        double total = 0.0;
        for (int row = 0; row < selectedDishesModel.getRowCount(); row++) {
            double price = (double) selectedDishesModel.getValueAt(row, 1);
            total += price;
        }

        DecimalFormat df = new DecimalFormat("#0.00");
        totalLabel.setText("R$ " + df.format(total));
    }

}
