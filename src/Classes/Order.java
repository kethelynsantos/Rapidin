package Classes;

public class Order {
    private String restaurants;
    private String users;

    public Order(String restaurants, String users) {
        this.restaurants = restaurants;
        this.users = users;
    }

    public String getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(String restaurants) {
        this.restaurants = restaurants;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }
}
