package Screens;

import Classes.*;
import Classes.Button;
import Classes.Frame;
import Classes.Input;
import java.util.Objects;


public class RegisterRest extends Frame {
    public RegisterRest() {
        super("Rapidin", "src/Images/register_rest.png");

        Input nameField = new Input();
        nameField.setBounds(47, 256, 297, 35);

        Input cnpjField = new Input();
        cnpjField.setBounds(47, 333, 297, 35);

        Button btn_back = new Button();
        btn_back.setBounds(28, 50, 30, 30);
        btn_back.addActionListener(e -> {
            System.out.println("fui clicado");
            Choice choice = new Choice();
            choice.setVisible(true);
            dispose();
        });

        Button btn_register = new Button();
        btn_register.setBounds(47, 676, 295, 48);

        btn_register.addActionListener(e -> {
                String name = nameField.getText();
                String cnpj = cnpjField.getText();

                Restaurant restaurant = new Restaurant(name, cnpj);

                if (!Objects.equals(name, "") && !Objects.equals(cnpj, "")) {
                    App.registerRest(restaurant);

                    RestOk restOk = new RestOk();
                    restOk.setVisible(true);
                    dispose();
                } else {
                    System.out.println("erro");
                    RegisterRest registerRest = new RegisterRest();
                    registerRest.setVisible(true);
                    dispose();
                }

            }
        );

        Button btn_account = new Button();
        btn_account.setBounds(46, 413, 295, 20);
        btn_account.addActionListener(e -> {
            HomeRest homeRest = new HomeRest();
            homeRest.setVisible(true);
            dispose();
        });

        // Adiciona à tela
        getContentPane().add(btn_back);
        getContentPane().add(btn_register);
        getContentPane().add(btn_account);
        getContentPane().add(nameField);
        getContentPane().add(cnpjField);

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);

    };

    public static void main(String[] args) {
        new RegisterRest();
    }
}
