package Screens;


import Classes.Button;
import Classes.Frame;

public class UserOk extends Frame {
    public UserOk() {
        super("UserOk", "src/Images/user_ok.png");

        Button btn_continue = new Button();
        btn_continue.setBounds(47, 675, 295, 48);
        btn_continue.addActionListener(e -> {
            HomeUser homeUser = new HomeUser();
            homeUser.setVisible(true);
            dispose();
        });


        // adiciona o botão à tela
        getContentPane().add(btn_continue);

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }
}
