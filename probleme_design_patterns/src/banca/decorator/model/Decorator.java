package banca.decorator.model;

public abstract class Decorator implements IPlata {

    private IPlata plata;

    public Decorator(IPlata plata) {
        this.plata = plata;
    }

    public void realizeazaPlata() {
        plata.realizeazaPlata();
    }

    public abstract void platesteContactless();
}
