package Screens;

import javax.swing.*;

public class Button extends JButton {
    public Button() {
        // Configura os atributos do botão
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(true);
    }

    public Button(String text) {
        // Chama o construtor padrão e define o texto do botão
        this();
        setText(text);
    }
}
