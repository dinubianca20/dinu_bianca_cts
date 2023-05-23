package probleme_test.s2.decorator.main;

import probleme_test.s2.decorator.model.Abonament;
import probleme_test.s2.decorator.model.AbonamentDecorat;
import probleme_test.s2.decorator.model.Decorator;
import probleme_test.s2.decorator.model.IAbonament;

public class Main {
    public static void main(String[] args) {
        Abonament abonament = new Abonament("Abonament1", 350);
        abonament.descriere();

        Decorator decorator = new AbonamentDecorat(abonament, true, false, true);
        System.out.println("Abonamentul are costul final "+decorator.costTotalAbonament(3)+" pentru 3 luni");
    }
}
