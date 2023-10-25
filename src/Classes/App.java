package Classes;

import java.util.ArrayList;

public class App {
    public static ArrayList<Restaurant> restaurantList = new ArrayList<>();
    public static ArrayList<User> usersList = new ArrayList<>();
    public static ArrayList<Order> ordersList = new ArrayList<>();

    public static Restaurant restaurant;

    public static void registerRest(String name, String cnpj) {
        restaurantList.add(new Restaurant(name, cnpj));
        System.out.println("array: " + restaurantList);
    }

    public static void registerUser(User user) {
        usersList.add(user);
    }
}
