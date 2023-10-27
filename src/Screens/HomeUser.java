package Screens;


import Classes.App;
import Classes.Button;
import Classes.Frame;

public class HomeUser extends Frame {
    public HomeUser() {
        super("HomeUser", "src/Images/home_user.png");

        Button btn_back = new Button();
        btn_back.setBounds(28, 50, 30, 30);
        btn_back.addActionListener(e -> {
            Choice choice = new Choice();
            choice.setVisible(true);
            dispose();
        });

        Button btn_order = new Button();
        btn_order.setBounds(29, 675, 167, 48);
        btn_order.addActionListener(e -> {
            ChoiceUser choiceUser = new ChoiceUser();
            choiceUser.setVisible(true);
            dispose();
        });

        Button btn_view = new Button();
        btn_view.setBounds(205, 675, 167, 48);
        btn_view.addActionListener(e -> {
            RegisterView registerView = new RegisterView();
            registerView.setVisible(true);
            dispose();
        });

        // Adiciona o botão à tela
        getContentPane().add(btn_back);
        getContentPane().add(btn_order);
        getContentPane().add(btn_view);

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }
}
