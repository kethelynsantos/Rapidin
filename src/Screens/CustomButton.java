package Screens;

import javax.swing.*;
import java.awt.*;

public class CustomButton extends JButton {
    public CustomButton() {
        // Configura os atributos comuns para os botões personalizados
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
    }

    public CustomButton(String text) {
        // Chame o construtor padrão e defina o texto do botão
        this();
        setText(text);
    }

    public void setCustomBounds(int x, int y, int width, int height) {
        // Defina as coordenadas e dimensões do botão
        setBounds(x, y, width, height);
    }
}

