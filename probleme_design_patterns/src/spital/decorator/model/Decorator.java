package spital.decorator.model;

public abstract class Decorator implements IPrintare {

    private IPrintare rezultat;

    public Decorator(IPrintare rezultat) {
        this.rezultat = rezultat;
    }

    public void printare() {
        rezultat.printare();
    }

    public abstract void trimitereOnline();
}
