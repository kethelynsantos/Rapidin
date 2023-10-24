package Classes;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private String cnpj;
    public static ArrayList<Food> ordersList = new ArrayList<>();

    public Restaurant(String name, String cnpj) {
        this.name = name;
        this.cnpj = cnpj;
    }

    public static void printMenu() {

    }

    public static void registerOrder(Food food) {
        ordersList.add(food);

        System.out.println(ordersList);
    }

    public static void removeOrder(Food food) {
        ordersList.remove(food);

        System.out.println(ordersList);
    }

    @Override
    public String toString() {
        return name + " " + cnpj;
    }
}
