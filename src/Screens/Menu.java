package Screens;


public class Menu extends Frame{
    public Menu() {
        super("Rapidin", "src/Images/choice_order.png");

        Button btn_back = new Button();
        btn_back.setBounds(28, 50, 30, 30);
        btn_back.addActionListener(e -> {
            System.out.println("fui clicado");
            ChoiceRest choiceRest = new ChoiceRest();
            choiceRest.setVisible(true);
            dispose(); // fecha a tela register
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
