package Screens;


public class HomeUser extends Frame{
    public HomeUser() {
        super("Rapidin", "src/Images/home_user.png");

        Button btn_back = new Button();
        btn_back.setBounds(28, 50, 30, 30);
        btn_back.addActionListener(e -> {
            System.out.println("fui clicado");
            Choice choice = new Choice();
            choice.setVisible(true);
            dispose(); // fecha a tela register
        });

        Button btn_order = new Button();
        btn_order.setBounds(29, 675, 167, 48);
        btn_order.addActionListener(e -> {
            ChoiceRest choiceRest = new ChoiceRest();
            choiceRest.setVisible(true);
            dispose(); // fecha a tela Start
        });

        Button btn_menu = new Button();
        btn_menu.setBounds(205, 675, 167, 48);
        btn_menu.addActionListener(e -> {
            Choice choice = new Choice();
            choice.setVisible(true);
            dispose(); // fecha a tela Start
        });

        // Adiciona o botão à tela
        getContentPane().add(btn_back);
        getContentPane().add(btn_order);
        getContentPane().add(btn_menu);

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        new HomeUser();
    }
}
