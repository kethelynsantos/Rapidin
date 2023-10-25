package Classes;

import java.util.ArrayList;

public class Restaurant {
    public String name;
    public String cnpj;
    public static ArrayList<Food> foodsList = new ArrayList<>();


    public Restaurant(String name, String cnpj) {
        this.name = name;
        this.cnpj = cnpj;
    }

    public  String getName() {
        return name;
    }

    public  void printMenu() {

    }

    public static ArrayList<Food> getFoods() {
        return foodsList;
    }

    public  void addFood(Food food) {
        foodsList.add(food);

        System.out.println(foodsList);
    }

    public  void removeOrder(Food food) {
        foodsList.remove(food);

        System.out.println(foodsList);
    }

    @Override
    public String toString() {
        return name;
    }
}
