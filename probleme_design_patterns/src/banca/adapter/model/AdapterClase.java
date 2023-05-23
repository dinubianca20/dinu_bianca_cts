package banca.adapter.model;

public class AdapterClase extends SoftLeasing implements ISoftBanca{
    public AdapterClase(String denumireLeasing) {
        super(denumireLeasing);
    }

    @Override
    public void realizeazaCredit(double valoareCredit) {
        super.oferaCreditLeasing(valoareCredit);
    }
}
