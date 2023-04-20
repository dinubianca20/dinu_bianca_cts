package proxy.main;

import proxy.model.IRestaurant;
import proxy.model.Proxy;
import proxy.model.Restaurant;

public class Main {
    public static void main(String[] args) {
        IRestaurant restaurant = new Restaurant("TemplePUB");
        restaurant.rezervaMasa(3);

        IRestaurant proxy = new Proxy(restaurant);
        proxy.rezervaMasa(2);
        proxy.rezervaMasa(5);
    }
}
