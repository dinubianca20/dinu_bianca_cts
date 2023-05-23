package farmacie.observer.model;

public class Client implements Observer{

    private String numeClient;

    public Client(String numeClient) {
        this.numeClient = numeClient;
    }

    public String getNumeClient() {
        return numeClient;
    }

    @Override
    public void receptioneazaNotificare(String mesaj) {
        System.out.println("Clientul " + this.numeClient + " a primit mesajul " + mesaj);
    }
}
