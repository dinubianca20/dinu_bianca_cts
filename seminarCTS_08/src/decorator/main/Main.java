package decorator.main;

import decorator.model.Bilet;
import decorator.model.BiletDecorat;
import decorator.model.Decorator;
import decorator.model.IBilet;

public class Main {
    public static void main(String[] args) {
        IBilet bilet = new Bilet("Silviu", "Romania", "Argentina");
        IBilet bilet1 = new Bilet("Silviu", "Romania", "Germania");
        IBilet bilet2 = new Bilet("Silviu", "Qatar", "Spania");

        bilet.printareBilet();
        bilet1.printareBilet();
        bilet2.printareBilet();

        Decorator decoratorBilet = new BiletDecorat(bilet);
        Decorator decoratorBilet1 = new BiletDecorat(bilet1);
        decoratorBilet.printareBilet();
        decoratorBilet1.printareBilet();
    }
}
