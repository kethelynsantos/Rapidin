package Classes;

public class Order {
    private Dish orderedDish;
    private User user;
    private Restaurant restaurant;

    public Order(Dish orderedDish, User user, Restaurant restaurant) {
        this.orderedDish = orderedDish;
        this.user = user;
        this.restaurant = restaurant;
    }

    public Dish getOrderedDish() {
        return orderedDish;
    }
}
