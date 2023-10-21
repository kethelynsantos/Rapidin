package Screens;


import Classes.Button;
import Classes.Frame;

public class HomeRest extends Frame {
    public HomeRest() {
        super("Rapidin", "src/Images/home_rest.png");

        Button btn_menu = new Button();
        btn_menu.setBounds(47, 675, 295, 48);
        btn_menu.addActionListener(e -> {
            RegisterOrder registerOrder = new RegisterOrder();
            registerOrder.setVisible(true);
            dispose();
        });

        Button btn_back = new Button();
        btn_back.setBounds(28, 50, 30, 30);
        btn_back.addActionListener(e -> {
            System.out.println("fui clicado");
            Choice choice = new Choice();
            choice.setVisible(true);
            dispose();
        });

        // Adiciona o botão à tela
        getContentPane().add(btn_menu);
        getContentPane().add(btn_back);

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        new HomeRest();
    }
}
