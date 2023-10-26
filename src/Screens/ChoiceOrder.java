package Screens;

import Classes.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.text.DecimalFormat;

public class ChoiceOrder extends Frame {
    private DefaultTableModel selectedDishesModel;
    private JTable selectedDishesTable;
    private JLabel totalLabel;

    public ChoiceOrder(ArrayList<Order> orders) {
        super("ChoiceOrder", "src/Images/choice_order.png");

        selectedDishesModel = new DefaultTableModel();
        selectedDishesModel.addColumn("Prato");
        selectedDishesModel.addColumn("Preço");

        selectedDishesTable = new JTable(selectedDishesModel);
        JScrollPane scrollPane = new JScrollPane(selectedDishesTable);
        scrollPane.setBounds(45, 283, 300, 400);
        getContentPane().add(scrollPane);

        totalLabel = new JLabel("Total: R$ 0.00");
        totalLabel.setBounds(45, 690, 200, 30);
        getContentPane().add(totalLabel);

        Button btn_confirm = new Button();
        btn_confirm.setBounds(47, 675, 295, 48);
        btn_confirm.addActionListener(e -> {
            // Não é necessário criar um novo pedido aqui, pois os pedidos já foram registrados em App.
            // Basta mostrar a tela de confirmação (ChoiceOk) ou outras ações necessárias.

            ChoiceOk choiceOk = new ChoiceOk();
            choiceOk.setVisible(true);
            dispose();
        });

        Button btn_back = new Button();
        btn_back.setBounds(28, 50, 30, 30);
        btn_back.addActionListener(e -> {
            // Volte para a tela de escolha de pratos
            ChoiceFood choiceFood = new ChoiceFood(App.restaurant, App.user);
            choiceFood.setVisible(true);
            dispose();
        });

        // Adiciona os botões à tela
        getContentPane().add(btn_confirm);
        getContentPane().add(btn_back);

        // Recalcula o total
        updateTotal();

        // Preencha a tabela com os pedidos já registrados em App
        for (Order order : orders) {
            for (Dish dish : order.getOrderedDishes()) {
                selectedDishesModel.addRow(new Object[]{dish.getName(), dish.getPrice()});
            }
        }

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
        totalLabel.setText("Total: R$ " + df.format(total));
    }

}
