package Screens;

import Classes.*;
import Classes.Button;
import Classes.Frame;
import Classes.Input;
import javax.swing.JOptionPane;
import java.util.Objects;

public class RegisterUser extends Frame {
    public RegisterUser() {
        super("RegisterUser", "src/Images/register_user.png");

        Input nameField = new Input();
        nameField.setBounds(47, 246, 297, 35);

        Input cpfField = new Input();
        cpfField.setBounds(47, 322, 297, 35);

        Button btn_back = new Button();
        btn_back.setBounds(28, 50, 30, 30);
        btn_back.addActionListener(e -> {
            Choice choice = new Choice();
            choice.setVisible(true);
            dispose();
        });

        Button btn_register = new Button();
        btn_register.setBounds(47, 676, 295, 48);
        btn_register.addActionListener(e -> {
            String name = nameField.getText();
            String cpf = cpfField.getText();

            if (!Objects.equals(name, "") && !Objects.equals(cpf, "")) {

                // verifica se o nome contém apenas caracteres
                if (!name.matches("^[a-zA-Z\\s]+$")) {
                    JOptionPane.showMessageDialog(RegisterUser.this,
                            "Nome inválido. Deve conter apenas letras e espaços.", "Erro",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // verifica se o CPF contém apenas números e tem 11 dígitos
                if (!cpf.matches("^[0-9]+$") || cpf.length() != 11) {
                    JOptionPane.showMessageDialog(RegisterUser.this,
                            "CPF inválido. Deve conter exatamente 11 dígitos numéricos.", "Erro",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                User user = new User(name, cpf);
                App.registerUser(user);

                UserOk userOk = new UserOk();
                userOk.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(RegisterUser.this,
                        "Por favor, preencha todos os campos.", "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        });

        Button btn_account = new Button();
        btn_account.setBounds(46, 413, 295, 20);
        btn_account.addActionListener(e -> {
            HomeUser homeUser = new HomeUser();
            homeUser.setVisible(true);
            dispose();
        });

        // adiciona à tela
        getContentPane().add(btn_back);
        getContentPane().add(btn_register);
        getContentPane().add(btn_account);
        getContentPane().add(nameField);
        getContentPane().add(cpfField);

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }
}
