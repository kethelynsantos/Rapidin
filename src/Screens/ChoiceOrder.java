package Screens;


import Classes.Button;
import Classes.Frame;

public class ChoiceOrder extends Frame {
    public ChoiceOrder() {
        super("Rapidin", "src/Images/choice_order.png");

        Button btn_ok = new Button();
        btn_ok.setBounds(47, 675, 295, 48);
        btn_ok.addActionListener(e -> {
            ChoiceOk choiceOk = new ChoiceOk();
            choiceOk.setVisible(true);
            dispose();
        });

        Button btn_back = new Button();
        btn_back.setBounds(28, 50, 30, 30);
        btn_back.addActionListener(e -> {
            System.out.println("fui clicado");
            ChoiceRest choiceRest = new ChoiceRest();
            choiceRest.setVisible(true);
            dispose();
        });

        // Adiciona o botão à tela
        getContentPane().add(btn_ok);
        getContentPane().add(btn_back);

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        new ChoiceOrder();
    }
}
