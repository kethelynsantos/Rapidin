package Screens;

public class RegisterRest extends Frame{
    public RegisterRest() {
        super("Rapidin", "src/Images/register_rest.png");

        Button btn_back = new Button();
        btn_back.setBounds(28, 50, 30, 30);
        btn_back.addActionListener(e -> {
            System.out.println("fui clicado");
            Choice choice = new Choice();
            choice.setVisible(true);
            dispose(); // fecha a tela register
        });

        Button btn_register = new Button();
        btn_register.setBounds(47, 676, 295, 48);
        btn_register.addActionListener(e -> {
            RestOk restOk = new RestOk();
            restOk.setVisible(true);
            dispose(); // fecha a tela Start
        });

        Button btn_account = new Button();
        btn_account.setBounds(46, 413, 295, 20);
        btn_account.addActionListener(e -> {
            HomeRest homeRest = new HomeRest();
            homeRest.setVisible(true);
            dispose(); // fecha a tela Start
        });

        Input name = new Input();
        name.setBounds(47, 256, 297, 35);

        Input cnpj = new Input();
        cnpj.setBounds(47, 333, 297, 35);

        // Adiciona à tela
        getContentPane().add(btn_back);
        getContentPane().add(btn_register);
        getContentPane().add(btn_account);
        getContentPane().add(name);
        getContentPane().add(cnpj);

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);

    }

    public static void main(String[] args) {
        new RegisterRest();
    }
}
