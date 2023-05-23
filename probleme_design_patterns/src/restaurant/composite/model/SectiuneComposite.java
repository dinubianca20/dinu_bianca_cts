package restaurant.composite.model;

import java.util.ArrayList;
import java.util.List;

public class SectiuneComposite implements Optiune{

    private String denumire;
    private List<Optiune> listaOptiuni;

    public SectiuneComposite(String denumire) {
        this.denumire = denumire;
        this.listaOptiuni = new ArrayList<>();
    }

    @Override
    public void adaugaOptiune(Optiune o) {
        listaOptiuni.add(o);
    }

    @Override
    public void stergeOptiune(Optiune o) {
        listaOptiuni.remove(o);
    }

    @Override
    public Optiune getIndex(int index) {
        return this.listaOptiuni.get(index);
    }

    @Override
    public void descriere() {
        System.out.println(denumire);
        for(Optiune optiune:this.listaOptiuni) {
            optiune.descriere();
        }
    }
}
