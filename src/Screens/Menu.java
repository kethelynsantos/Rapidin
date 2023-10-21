package Screens;


import Classes.Button;
import Classes.Frame;

public class Menu extends Frame {
    public Menu() {
        super("Rapidin", "src/Images/menu.png");

        Button btn_back = new Button();
        btn_back.setBounds(28, 50, 30, 30);
        btn_back.addActionListener(e -> {
            System.out.println("fui clicado");
            HomeUser homeUser = new HomeUser();
            homeUser.setVisible(true);
            dispose();
        });

        // Adiciona o botão à tela
        getContentPane().add(btn_back);

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        new Menu();
    }
}
