package Screens;


public class RestOk extends Frame{
    public RestOk() {
        super("Rapidin", "src/Images/rest_ok.png");

        Button btn_continue = new Button();
        btn_continue.setBounds(47, 675, 295, 48);
        btn_continue.addActionListener(e -> {
            Home home = new Home();
            home.setVisible(true);
            dispose(); // fecha a tela Start
        });


        // Adiciona o botão à tela
        getContentPane().add(btn_continue);

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        new RestOk();
    }
}