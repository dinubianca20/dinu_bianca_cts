package banca.adapter.model;

public class AdapterObiecte implements ISoftBanca{

    private ISoftLeasing softLeasing;

    public AdapterObiecte(ISoftLeasing softLeasing) {
        this.softLeasing = softLeasing;
    }

    @Override
    public void realizeazaCredit(double valoareCredit) {
        this.softLeasing.oferaCreditLeasing(valoareCredit);
    }
}
