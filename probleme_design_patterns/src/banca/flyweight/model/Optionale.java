package banca.flyweight.model;

public class Optionale {

    private int nrCont;
    private float suma;

    public Optionale(int nrCont, float suma) {
        this.nrCont = nrCont;
        this.suma = suma;
    }

    public int getNrCont() {
        return nrCont;
    }

    public float getSuma() {
        return suma;
    }
}
