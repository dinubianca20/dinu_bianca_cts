package restaurant.decorator.main;

import restaurant.decorator.model.Decorator;
import restaurant.decorator.model.INotaDePlata;
import restaurant.decorator.model.NotaDePlata;
import restaurant.decorator.model.NotaDecorata;

public class Main {
    public static void main(String[] args) {
        INotaDePlata notaDePlata = new NotaDePlata(200);
        notaDePlata.printeazaNota();

        Decorator notaDecorata = new NotaDecorata(notaDePlata);
        notaDecorata.printeazaNota();
    }
}
