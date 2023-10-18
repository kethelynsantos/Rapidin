package Screens;


public class OrderOk extends Frame{
    public OrderOk() {
        super("Rapidin", "src/Images/order_ok.png");

        Button btn_continue = new Button();
        btn_continue.setBounds(47, 675, 295, 48);
        btn_continue.addActionListener(e -> {
            HomeRest homeRest = new HomeRest();
            homeRest.setVisible(true);
            dispose(); // fecha a tela Start
        });


        // Adiciona o botão à tela
        getContentPane().add(btn_continue);

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        new OrderOk();
    }
}
