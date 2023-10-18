package Screens;

import Classes.Button;
import Classes.Frame;
import Classes.Input;

public class RegisterUser extends Frame {
    public RegisterUser() {
        super("Rapidin", "src/Images/register_user.png");

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
            System.out.println("fui clicado");
            UserOk serOk = new UserOk();
            serOk.setVisible(true);
            dispose();
        });

        Button btn_account = new Button();
        btn_account.setBounds(46, 413, 295, 20);
        btn_account.addActionListener(e -> {
            HomeUser homeUser = new HomeUser();
            homeUser.setVisible(true);
            dispose();
        });

        Input name = new Input();
        name.setBounds(47, 246, 297, 35);

        Input cnpj = new Input();
        cnpj.setBounds(47, 322, 297, 35);

        // Adiciona à tela
        getContentPane().add(btn_back);
        getContentPane().add(btn_register);
        getContentPane().add(btn_account);
        getContentPane().add(name);
        getContentPane().add(cnpj);

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);

    }

    public static void main(String[] args) {
        new RegisterUser();
    }
}
