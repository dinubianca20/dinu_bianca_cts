package probleme_test.s2.decorator.model;

public class Abonament implements IAbonament{

    private String numeAbonament;
    private float costAbonament;

    public Abonament(String numeAbonament, float costAbonament) {
        this.numeAbonament = numeAbonament;
        this.costAbonament = costAbonament;
    }

    public float getCostAbonament() {
        return costAbonament;
    }

    @Override
    public void descriere() {
        System.out.println("Abonamentul "+numeAbonament+" este in valoare de "+costAbonament+" lei");
    }
}
