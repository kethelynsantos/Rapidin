package Classes;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private String cnpj;
    private ArrayList<Dish> dishesList;
    public static Dish dish;

    public Restaurant(String name, String cnpj) {
        this.name = name;
        this.cnpj = cnpj;
        this.dishesList = new ArrayList<>();
    }

    public ArrayList<Dish> getDishesList() {
        return dishesList;
    }

    public  String getName() {
        return name;
    }

    public void printMenu() {

    }

    public void addFood(Dish dish) {
        dishesList.add(dish);
    }

    public  void removeOrder(Dish dish) {
        dishesList.remove(dish);
    }

    public ArrayList<Dish> getFoods() {
        return dishesList;
    }

    @Override
    public String toString() {
        return name;
    }
}
