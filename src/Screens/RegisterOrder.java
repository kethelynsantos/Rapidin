package Screens;

import Classes.*;
import java.util.Objects;
import javax.swing.JOptionPane;

public class RegisterOrder extends Frame {
    public RegisterOrder(Restaurant selectedRestaurant) {
        super("RegisterOrder", "src/Images/register_order.png");

        App.restaurant = selectedRestaurant;

        System.out.println("restaurante selecionado: " + selectedRestaurant);

        Input nameField = new Input();
        nameField.setBounds(47, 246, 297, 35);

        Input priceField = new Input();
        priceField.setBounds(47, 322, 297, 35);

        Button btn_back = new Button();
        btn_back.setBounds(28, 50, 30, 30);
        btn_back.addActionListener(e -> {
            HomeRest homeRest = new HomeRest();
            homeRest.setVisible(true);
            dispose();
        });

        Button btn_register = new Button();
        btn_register.setBounds(47, 676, 295, 48);
        btn_register.addActionListener(e -> {
            String name = nameField.getText();
            String priceStr = priceField.getText();

            if (!Objects.equals(name, "") && !Objects.equals(priceStr, "")) {
                // verifica se o nome contém apenas caracteres
                if (!name.matches("^[a-zA-Z\\s]+$")) {
                    JOptionPane.showMessageDialog(RegisterOrder.this,
                            "Nome inválido. Deve conter apenas letras e espaços.", "Erro",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                try {
                    double price = Double.parseDouble(priceStr);
                    Dish dish = new Dish(name, price);
                    selectedRestaurant.addFood(dish); // Adicione o prato ao restaurante selecionado
                    OrderOk orderOk = new OrderOk();
                    orderOk.setVisible(true);
                    dispose();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(RegisterOrder.this,
                            "O preço deve ser um número válido.", "Erro",
                            JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(RegisterOrder.this,
                        "Por favor, preencha todos os campos.", "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        });

        // Adiciona à tela
        getContentPane().add(btn_back);
        getContentPane().add(btn_register);
        getContentPane().add(nameField);
        getContentPane().add(priceField);

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }
}
