package banca.chainofresponsability.model;

public class Client {
    private String nume;
    private float sumaDorita;

    public Client(String nume, float sumaDorita) {
        this.nume = nume;
        this.sumaDorita = sumaDorita;
    }

    public String getNume() {
        return nume;
    }

    public float getSumaDorita() {
        return sumaDorita;
    }
}
