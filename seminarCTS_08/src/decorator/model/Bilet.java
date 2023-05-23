package decorator.model;

public class Bilet implements IBilet{
    private String numeCumparator;
    private String echipaLocala;
    private String echipaRivala;

    public Bilet(String numeCumparator, String echipaLocala, String echipaRivala) {
        super();
        this.numeCumparator = numeCumparator;
        this.echipaLocala = echipaLocala;
        this.echipaRivala = echipaRivala;
    }

    @Override
    public void printareBilet() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Bilet{" +
                "numeCumparator='" + numeCumparator + '\'' +
                ", numeEchipa1='" + echipaLocala + '\'' +
                ", numeEchipa2='" + echipaRivala + '\'' +
                '}';
    }

    public String getEchipaLocala() {
        return echipaLocala;
    }
}
