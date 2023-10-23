package Screens;

import Classes.*;
import java.util.Objects;
import javax.swing.JOptionPane;

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

            if (!Objects.equals(name, "") && !Objects.equals(cnpj, "")) {
                // verifica se o nome contém apenas caracteres
                if (!name.matches("^[a-zA-Z\\s]+$")) {
                    JOptionPane.showMessageDialog(RegisterRest.this,
                            "Nome inválido. Deve conter apenas letras e espaços.", "Erro",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (isCnpjValid(cnpj)) {
                    Restaurant restaurant = new Restaurant(name, cnpj);

                    App.registerRest(restaurant);

                    RestOk restOk = new RestOk();
                    restOk.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(RegisterRest.this,
                            "O CNPJ não é válido.", "Erro",
                            JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(RegisterRest.this,
                        "Por favor, preencha todos os campos.", "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        });

        Button btn_account = new Button();
        btn_account.setBounds(46, 413, 295, 20);
        btn_account.addActionListener(e -> {
            HomeRest homeRest = new HomeRest();
            homeRest.setVisible(true);
            dispose();
        });

        // Adicione à tela
        getContentPane().add(btn_back);
        getContentPane().add(btn_register);
        getContentPane().add(btn_account);
        getContentPane().add(nameField);
        getContentPane().add(cnpjField);

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        new RegisterRest();
    }

    private boolean isCnpjValid(String cnpj) {
        // remove caracteres não numéricos
        cnpj = cnpj.replaceAll("[^0-9]", "");

        // verifica se o CNPJ possui 14 dígitos
        if (cnpj.length() != 14) {
            return false;
        }

        // verifica se todos os dígitos são iguais
        boolean allDigitsEqual = true;
        char firstDigit = cnpj.charAt(0);
        for (char digit : cnpj.toCharArray()) {
            if (digit != firstDigit) {
                allDigitsEqual = false;
                break;
            }
        }

        return !allDigitsEqual;
    }

}
