package restaurant.composite.main;

import restaurant.composite.model.Optiune;
import restaurant.composite.model.Produs;
import restaurant.composite.model.SectiuneComposite;

public class Main {
    public static void main(String[] args) {
        Optiune meniu = new SectiuneComposite("Restaurant");

        //sectiuni
        Optiune sectiuneBauturi = new SectiuneComposite("Bauturi");
        Optiune sectiuneDesert = new SectiuneComposite("Desert");

        //subsectiuni
        Optiune subsectiuneBauturi = new SectiuneComposite("Cafea");
        Optiune subsectiuneApa = new SectiuneComposite("Apa");

        Optiune produsCafeaNeagra = new Produs("Cafea neagra");
        Optiune produsCafeaArabica = new Produs("Cafea Arabica");

        subsectiuneBauturi.adaugaOptiune(produsCafeaNeagra);
        subsectiuneBauturi.adaugaOptiune(produsCafeaArabica);
        sectiuneBauturi.adaugaOptiune(subsectiuneBauturi);
        sectiuneBauturi.adaugaOptiune(subsectiuneApa);

        meniu.adaugaOptiune(sectiuneBauturi);
        meniu.adaugaOptiune(sectiuneDesert);

        meniu.descriere();


    }
}
