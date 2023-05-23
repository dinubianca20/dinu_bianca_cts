package banca.adapter.model;

public class SoftLeasing implements ISoftLeasing{

    private String denumireLeasing;

    public SoftLeasing(String denumireLeasing) {
        this.denumireLeasing = denumireLeasing;
    }

    @Override
    public void oferaCreditLeasing(double valoareLeasing) {
        System.out.println("Banca ofera leasing-ul " +this.denumireLeasing+" in valoare de " + valoareLeasing);
    }
}
