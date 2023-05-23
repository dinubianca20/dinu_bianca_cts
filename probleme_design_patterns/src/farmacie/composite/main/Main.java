package farmacie.composite.main;

import farmacie.composite.model.Composite;
import farmacie.composite.model.Element;
import farmacie.composite.model.Medicament;

public class Main {
    public static void main(String[] args) {
        Element farmacie = new Composite("Catena");

        //sectiuni
        Element sectiuneRaceala = new Composite("Raceala");
        Element sectiuneDurere = new Composite("Durere");
        Element sectiuneAntibiotice = new Composite("Antibiotice");

        //subsectiuni
        Element subsectiuneAdulti = new Composite("Adulti");
        Element subsectiuneCopii = new Composite("Copii");

        Element medicament1 = new Medicament("Medicament1");
        Element medicament2 = new Medicament("Medicament2");
        Element medicament3 = new Medicament("Medicament3");

        subsectiuneAdulti.adaugaElement(medicament1);
        subsectiuneAdulti.adaugaElement(medicament2);
        subsectiuneCopii.adaugaElement(medicament3);

        sectiuneRaceala.adaugaElement(subsectiuneAdulti);
        sectiuneRaceala.adaugaElement(subsectiuneCopii);
        sectiuneDurere.adaugaElement(subsectiuneAdulti);
        sectiuneDurere.adaugaElement(subsectiuneCopii);
        sectiuneAntibiotice.adaugaElement(subsectiuneAdulti);
        sectiuneAntibiotice.adaugaElement(subsectiuneCopii);

        farmacie.adaugaElement(sectiuneRaceala);
        farmacie.adaugaElement(sectiuneDurere);
        farmacie.adaugaElement(sectiuneAntibiotice);

        farmacie.descriere(" ");
    }
}
