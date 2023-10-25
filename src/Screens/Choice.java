package Screens;


import Classes.Button;
import Classes.Frame;

public class Choice extends Frame {
    public Choice() {
        super("Choice", "src/Images/choice.png");

        Button btn_rest = new Button();
        btn_rest.setBounds(94, 574, 201, 48);
        btn_rest.addActionListener(e -> {
            System.out.println("fui clicado");
            RegisterRest registerRest = new RegisterRest();
            registerRest.setVisible(true);
            dispose();
        });

        Button btn_user = new Button();
        btn_user.setBounds(94, 665, 201, 48);
        btn_user.addActionListener(e -> {
            System.out.println("fui clicado");
            RegisterUser registerUser = new RegisterUser();
            registerUser.setVisible(true);
            dispose();
        });


        // Adiciona os botões à tela
        getContentPane().add(btn_rest);
        getContentPane().add(btn_user);

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        new Choice();
    }
}
