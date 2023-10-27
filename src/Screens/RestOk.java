package Screens;


import Classes.Button;
import Classes.Frame;

public class RestOk extends Frame {
    public RestOk() {
        super("RestOk", "src/Images/rest_ok.png");

        Button btn_continue = new Button();
        btn_continue.setBounds(47, 675, 295, 48);
        btn_continue.addActionListener(e -> {
            HomeRest homeRest = new HomeRest();
            homeRest.setVisible(true);
            dispose();
        });

        // adiciona o botão à tela
        getContentPane().add(btn_continue);

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }
}
