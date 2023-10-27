package Classes;

import java.util.ArrayList;

public class App {
    public static ArrayList<Restaurant> restaurantList = new ArrayList<>();
    public static ArrayList<User> usersList = new ArrayList<>();
    public static ArrayList<Order> ordersList = new ArrayList<>();

    public static Restaurant restaurant;
    public static User user;

    public static ArrayList<Order> getOrdersList() {
        return ordersList;
    }

    public static void initializeRestaurants() {
        Restaurant restaurant1 = new Restaurant("Restaurante 1", "CNPJ 1");
        Restaurant restaurant2 = new Restaurant("Restaurante 2", "CNPJ 2");
        Restaurant restaurant3 = new Restaurant("Restaurante 3", "CNPJ 3");

        restaurant1.addFood(new Dish("Prato 1", 10.99));
        restaurant2.addFood(new Dish("Prato 2", 15.99));
        restaurant3.addFood(new Dish("Prato 3", 8.99));

        restaurantList.add(restaurant1);
        restaurantList.add(restaurant2);
        restaurantList.add(restaurant3);

        User user1 = new User("João", "12121212121");
        User user2 = new User("Maria", "4343434343");
        User user3 = new User("Pedro", "5656565656");

        usersList.add(user1);
        usersList.add(user2);
        usersList.add(user3);
    }

    public static void registerRest(String name, String cnpj) {
        restaurantList.add(new Restaurant(name, cnpj));
    }

    public static void registerUser(User user) {
        usersList.add(user);
    }

    public static void registerOrder(Order order) {
        ordersList.add(order);
    }
}
