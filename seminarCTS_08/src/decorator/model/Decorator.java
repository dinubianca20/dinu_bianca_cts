package decorator.model;

public abstract class Decorator implements IBilet {

    private IBilet bilet;

    public Decorator(IBilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void printareBilet() {
        this.bilet.printareBilet();
        printareMesajSustinere();
    }

    @Override
    public String getEchipaLocala() {
        return bilet.getEchipaLocala();
    }

    public IBilet getBilet() {
        return bilet;
    }

    public abstract void printareMesajSustinere();
}
