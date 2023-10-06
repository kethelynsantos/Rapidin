package Screens;

public class RegisterRest extends Frame{
    public RegisterRest() {
        super("Rapidin", "src/Images/register_rest.png");

        Button btn_voltar = new Button();
        btn_voltar.setBounds(28, 50, 30, 30);
        btn_voltar.addActionListener(e -> {
            System.out.println("fui clicado");
            Home home = new Home();
            home.setVisible(true);
            dispose(); // fecha a tela register
        });

        Button btn_register = new Button();
        btn_register.setBounds(47, 676, 295, 48);
        btn_register.addActionListener(e -> {
            System.out.println("fui clicado");
            RegisterRest registerRest = new RegisterRest();
            registerRest.setVisible(true);
            dispose(); // fecha a tela Home
        });

        Input name = new Input();
        name.setBounds(40, 50, 50, 30);

        // Adiciona os botões à tela
        getContentPane().add(btn_voltar);
        getContentPane().add(btn_register);
        getContentPane().add(name);

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);

    }

    public static void main(String[] args) {
        new RegisterRest();
    }
}
