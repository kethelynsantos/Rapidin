package Classes;

import java.util.ArrayList;

public class App {
    public String restaurants;
    public String users;
    public String order;
    public static ArrayList<Restaurant> restaurantList = new ArrayList<>();
    public static ArrayList<User> usersList = new ArrayList<>();
    public static ArrayList<Order> ordersList = new ArrayList<>();

    public static void registerRest(Restaurant restaurant) {
        restaurantList.add(restaurant);

        System.out.println(restaurantList);
    }



}
