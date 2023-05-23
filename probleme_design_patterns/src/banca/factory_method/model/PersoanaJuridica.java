package banca.factory_method.model;

public class PersoanaJuridica implements IPersoana{
    private String denumire;
    private String cui;

    public PersoanaJuridica() {

    }

    public PersoanaJuridica(String denumire, String cui) {
        this.denumire = denumire;
        this.cui = cui;
    }

    public String getDenumire() {
        return denumire;
    }

    public String getCui() {
        return cui;
    }

    @Override
    public void descriere() {
        System.out.println("Firma " + this.getDenumire() +", cui " + this.getCui() + " reprezinta persoana juridica.");
    }
}
