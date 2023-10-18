package Screens;

public class RegisterOrder extends Frame{
    public RegisterOrder() {
        super("Rapidin", "src/Images/register_order.png");

        Button btn_back = new Button();
        btn_back.setBounds(28, 50, 30, 30);
        btn_back.addActionListener(e -> {
            System.out.println("fui clicado");
            HomeRest homeRest = new HomeRest();
            homeRest.setVisible(true);
            dispose(); // fecha a tela register
        });

        Button btn_register = new Button();
        btn_register.setBounds(47, 676, 295, 48);
        btn_register.addActionListener(e -> {
            System.out.println("fui clicado");
            OrderOk orderOk = new OrderOk();
            orderOk.setVisible(true);
            dispose(); // fecha a tela Home
        });

        Input name = new Input();
        name.setBounds(47, 246, 297, 35);

        Input price = new Input();
        price.setBounds(47, 322, 297, 35);

        // Adiciona os botões à tela
        getContentPane().add(btn_back);
        getContentPane().add(btn_register);
        getContentPane().add(name);
        getContentPane().add(price);

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);

    }

    public static void main(String[] args) {
        new RegisterOrder();
    }
}
