package Screens;


public class ChoiceRest extends Frame{
    public ChoiceRest() {
        super("Rapidin", "src/Images/choice_rest.png");

        Button btn_next = new Button();
        btn_next.setBounds(47, 675, 295, 48);
        btn_next.addActionListener(e -> {
            ChoiceOrder choiceOrder = new ChoiceOrder();
            choiceOrder.setVisible(true);
            dispose(); // fecha a tela Start
        });

        Button btn_back = new Button();
        btn_back.setBounds(28, 50, 30, 30);
        btn_back.addActionListener(e -> {
            System.out.println("fui clicado");
            HomeUser homeUser = new HomeUser();
            homeUser.setVisible(true);
            dispose(); // fecha a tela register
        });

        // Adiciona o botão à tela
        getContentPane().add(btn_next);
        getContentPane().add(btn_back);

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        new ChoiceRest();
    }
}
