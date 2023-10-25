package Classes;

import java.util.ArrayList;

public class Restaurant {
    public String name;
    public String cnpj;
    public  ArrayList<Food> ordersList = new ArrayList<>();


    public Restaurant(String name, String cnpj) {
        this.name = name;
        this.cnpj = cnpj;
    }

    public  String getName() {
        return name;
    }

    public  void printMenu() {

    }

    public  void registerOrder(Food food) {
        ordersList.add(food);

        System.out.println(ordersList);
    }

    public  void removeOrder(Food food) {
        ordersList.remove(food);

        System.out.println(ordersList);
    }

    @Override
    public String toString() {
        return name;
    }
}
