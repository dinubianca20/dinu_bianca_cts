package flyweight.main;

import flyweight.model.FabricaSpectatori;
import flyweight.model.PozitieDesenare;

public class Main {
    public static void main(String[] args) {
        FabricaSpectatori fabricaSpectatori = new FabricaSpectatori();
        PozitieDesenare pozitieDesenare = new PozitieDesenare(20, 10, "Rosu");
        PozitieDesenare pozitieDesenare1 = new PozitieDesenare(10, 30, "Verde");
        PozitieDesenare pozitieDesenare2 = new PozitieDesenare(24, 12, "Alabstru");

        fabricaSpectatori.getSpectator(1, 20, 30).deseneazaSpectator(pozitieDesenare);
        fabricaSpectatori.getSpectator(2, (float)23.5, 30).deseneazaSpectator(pozitieDesenare1);
        fabricaSpectatori.getSpectator(3, (float)20.7, 30).deseneazaSpectator(pozitieDesenare2);

    }
}
