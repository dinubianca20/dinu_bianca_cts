package restaurant.composite.model;

public class Produs implements Optiune{

    private String denumire;

    public Produs(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void adaugaOptiune(Optiune o) {
        throw new IllegalArgumentException("Nu se implementeaza!");
    }

    @Override
    public void stergeOptiune(Optiune o) {
        throw new IllegalArgumentException("Nu se implementeaza!");
    }

    @Override
    public Optiune getIndex(int index) {
        throw new IllegalArgumentException("Nu se implementeaza!");
    }

    @Override
    public void descriere() {
        System.out.println("    " + this.denumire);
    }
}
