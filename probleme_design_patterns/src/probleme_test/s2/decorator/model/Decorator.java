package probleme_test.s2.decorator.model;

public abstract class Decorator implements IAbonament{

    private Abonament abonament;

    public Decorator(Abonament abonament) {
        this.abonament = abonament;
    }

    public void descriere() {
        abonament.descriere();
    }

    public Abonament getAbonament() {
        return abonament;
    }

    public abstract float costTotalAbonament(int nrLuni);
}
