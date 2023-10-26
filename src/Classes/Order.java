package Classes;

import java.util.ArrayList;

public class Order {
    private String restaurants;
    private String users;

    public Order(String restaurants, String users) {
        this.restaurants = restaurants;
        this.users = users;
    }

    public Order(Dish selectedDish, User user, Restaurant selectedRestaurant) {
    }

    public static void placeOrder() {

    }

    public static void printOrder() {

    }
}
