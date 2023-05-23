package banca.decorator.main;

import banca.decorator.model.Decorator;
import banca.decorator.model.IPlata;
import banca.decorator.model.PlataDecorata;
import banca.decorator.model.PlataFizic;

public class Main {
    public static void main(String[] args) {
        IPlata plataFizic = new PlataFizic();
        plataFizic.realizeazaPlata();

        Decorator plataDecorata = new PlataDecorata(plataFizic);
        plataDecorata.realizeazaPlata();
        plataDecorata.platesteContactless();
    }
}
