package Screens;

import Classes.*;

public class Main {
    public static void main(String[] args) {
        App.initializeRestaurants();
        Start startScreen = new Start();
        startScreen.setVisible(true);
    }
}
