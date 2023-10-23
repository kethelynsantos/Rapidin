package Classes;

import java.util.ArrayList;

public class App {
    public static ArrayList<Restaurant> restaurantList = new ArrayList<>();
    public static ArrayList<User> usersList = new ArrayList<>();
    public static ArrayList<Food> ordersList = new ArrayList<>();

    public static void registerRest(Restaurant restaurant) {
        restaurantList.add(restaurant);

        System.out.println(restaurantList);
    }

    public static void registerUser(User user) {
        usersList.add(user);

        System.out.println(usersList);
    }

    public static void registerOrder(Food food) {
        ordersList.add(food);

        System.out.println(ordersList);
    }

}
