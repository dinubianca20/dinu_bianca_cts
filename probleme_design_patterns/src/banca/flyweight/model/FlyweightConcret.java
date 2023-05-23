package banca.flyweight.model;

public class FlyweightConcret implements IFlyweight {

    private int nrClient;
    private String nume;
    private String nrTelefon;
    private String email;

    public FlyweightConcret(int nrClient, String nume, String nrTelefon, String email) {
        this.nrClient = nrClient;
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.email = email;
    }

    @Override
    public void descriereClient(Optionale optionale) {
        System.out.println("Clientul "+nume+" cu nr de telefon "+nrTelefon+" si adresa de email "+email+"" +
                " are contul "+optionale.getNrCont()+" cu suma "+optionale.getSuma());
    }
}
