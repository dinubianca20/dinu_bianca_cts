package farmacie.composite.model;

public interface Element {

    void adaugaElement(Element e);
    void stergeElement(Element e);
    Element getElement(int index);
    void descriere(String indentare);
}
