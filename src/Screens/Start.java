package Screens;


public class Start extends Frame {
    public Start() {
        super("Rapidin", "src/Images/start.png");

        Button btn_start = new Button();
        btn_start.setBounds(95, 720, 198, 48);
        btn_start.addActionListener(e -> {
            Home home = new Home();
            home.setVisible(true);
            dispose(); // fecha a tela Start
        });


        // Adiciona o botão à tela
        getContentPane().add(btn_start);

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        new Start();
    }
}
