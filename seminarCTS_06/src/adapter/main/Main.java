package adapter.main;

import adapter.model.bar.ISoftBar;
import adapter.model.bar.SoftBar;
import adapter.model.bucatarie.AdapterRestaurantClase;
import adapter.model.bucatarie.AdapterRestaurantObiecte;
import adapter.model.bucatarie.Restaurant;
import adapter.model.bucatarie.ISoftRestaurant;

public class Main {

    public static void imprimare(ISoftRestaurant restaurant, double totalNota) {
        restaurant.printeazaNota(totalNota);
    }

    public static void main(String[] args) {
        ISoftBar bar = new SoftBar("Interbelic");
//        bar.printeazaNotaBauturi(240);

        ISoftRestaurant bucatarie = new Restaurant("George");
//        bucatarie.printeazaNota(300);
//        Main.imprimare(bar, 300);
        Main.imprimare(bucatarie, 500);

        AdapterRestaurantClase adapterRestaurant = new AdapterRestaurantClase("Interbelic");
        Main.imprimare(adapterRestaurant, 450);


        //main pentru obiecte
        AdapterRestaurantObiecte adapterRestaurantObiecte = new AdapterRestaurantObiecte(bar);
        Main.imprimare(adapterRestaurantObiecte, 600);

    }
}
