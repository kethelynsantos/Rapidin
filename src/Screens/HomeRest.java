package Screens;


import Classes.App;
import Classes.Button;
import Classes.Frame;

public class HomeRest extends Frame {
    public HomeRest() {
        super("HomeRest", "src/Images/home_rest.png");
        Button btn_choice = new Button();
        btn_choice.setBounds(24, 675, 167, 48);
        btn_choice.addActionListener(e -> {
            RegisterChoice registerChoice = new RegisterChoice();
            registerChoice.setVisible(true);
            dispose();
        });

        Button btn_view = new Button();
        btn_view.setBounds(200, 675, 167, 48);
        btn_view.addActionListener(e -> {
            RegisterView registerView = new RegisterView();
            registerView.setVisible(true);
            dispose();
        });

        Button btn_back = new Button();
        btn_back.setBounds(28, 50, 30, 30);
        btn_back.addActionListener(e -> {
            Choice choice = new Choice();
            choice.setVisible(true);
            dispose();
        });

        // Adiciona à tela
        getContentPane().add(btn_choice);
        getContentPane().add(btn_view);
        getContentPane().add(btn_back);

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }
}
