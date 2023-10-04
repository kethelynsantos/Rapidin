package Screens;


public class Home extends Frame{
    public Home() {
        super("Rapidin", "src/Images/home.png");

        Button btn_rest = new Button();
        btn_rest.setBounds(22, 549, 96, 95);
        btn_rest.addActionListener(e -> {
            System.out.println("fui clicado");
            Home home = new Home();
            home.setVisible(true);
            dispose(); // fecha a tela Home
        });

        Button btn_user = new Button();
        btn_user.setBounds(140, 549, 96, 95);
        btn_user.addActionListener(e -> {
            System.out.println("fui clicado");
            Home home = new Home();
            home.setVisible(true);
            dispose(); // fecha a tela Home
        });

        Button btn_order = new Button();
        btn_order.setBounds(258, 549, 96, 95);
        btn_order.addActionListener(e -> {
            System.out.println("fui clicado");
            Home home = new Home();
            home.setVisible(true);
            dispose(); // fecha a tela Home
        });


        // Adiciona os botões à tela
        getContentPane().add(btn_rest);
        getContentPane().add(btn_user);
        getContentPane().add(btn_order);

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        new Home();
    }
}
