package farmacie.composite.model;

public class Medicament implements Element{

    private String denumire;

    public Medicament(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void adaugaElement(Element e) {
        throw new IllegalArgumentException("Nu se implementeaza!");
    }

    @Override
    public void stergeElement(Element e) {
        throw new IllegalArgumentException("Nu se implementeaza!");
    }

    @Override
    public Element getElement(int index) {
        throw new IllegalArgumentException("Nu se implementeaza!");
    }

    @Override
    public void descriere(String indentare) {
        System.out.println(indentare+this.denumire);
    }
}
