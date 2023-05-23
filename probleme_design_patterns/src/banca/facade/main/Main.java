package banca.facade.main;

import banca.facade.model.CreareCont;
import banca.facade.model.Facade;
import banca.facade.model.Persoana;

public class Main {
    public static void main(String[] args) {
        Persoana persoana = new Persoana("Bianca", 22,false,false);

        CreareCont creareCont = new CreareCont(persoana);

        Facade facade = new Facade(creareCont);
        facade.creareCont();
    }
}
