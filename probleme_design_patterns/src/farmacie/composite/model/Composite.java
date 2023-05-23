package farmacie.composite.model;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Element{

    private String denumire;
    private List<Element> listaMedicamente;

    public Composite(String denumire) {
        this.denumire = denumire;
        this.listaMedicamente = new ArrayList<>();
    }

    @Override
    public void adaugaElement(Element e) {
        this.listaMedicamente.add(e);
    }

    @Override
    public void stergeElement(Element e) {
        this.listaMedicamente.remove(e);
    }

    @Override
    public Element getElement(int index) {
        return this.listaMedicamente.get(index);
    }

    @Override
    public void descriere(String indentare) {
        System.out.println(indentare+this.denumire);
        for(Element e : listaMedicamente){
            e.descriere(indentare + "  ");
        }
    }
}
