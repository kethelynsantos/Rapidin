package Screens;


import Classes.Button;
import Classes.Frame;

public class Start extends Frame {
    public Start() {
        super("Start", "src/Images/start.png");

        Button btn_start = new Button();
        btn_start.setBounds(95, 720, 198, 48);
        btn_start.addActionListener(e -> {
            Choice choice = new Choice();
            choice.setVisible(true);
            dispose(); // fecha a tela Start
        });


        // adiciona o botão à tela
        getContentPane().add(btn_start);

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }
}
