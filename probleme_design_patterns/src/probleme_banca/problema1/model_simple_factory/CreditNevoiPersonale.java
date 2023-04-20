package probleme_banca.problema1.model_simple_factory;

public class CreditNevoiPersonale implements ICredit{
    private String denumire;
    private int valoare;

    public CreditNevoiPersonale(String denumire, int suma) {
        this.denumire = denumire;
        if(suma > 0) {
            this.valoare = suma;
        }
        else {
            throw new IllegalArgumentException("Valoarea este nula!");
        }

    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getValoare() {
        return valoare;
    }

    public void setValoare(int valoare) {
        this.valoare = valoare;
    }

    @Override
    public void descriere() {
        System.out.println("Acesta este un credit de nevoi personale cu denumirea " + this.getDenumire() + " in valoare de " + this.getValoare() + "EUR.");
    }
}
