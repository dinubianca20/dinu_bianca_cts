package spital.adapter.model.magazin;

public class MedicamentMagazin implements IMagazin{

    private String denumireMedicament;

    public MedicamentMagazin(String denumireMedicament) {
        this.denumireMedicament = denumireMedicament;
    }

    public void achizitioneazaMedicament() {
        prezintaReteta();
        System.out.println("Medicamentul " + this.denumireMedicament + " a fost cumparat");
    }

    @Override
    public void prezintaReteta() {
        System.out.println("Reteta a fost prezentata!");
    }
}
