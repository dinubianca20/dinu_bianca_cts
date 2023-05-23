package farmacie.observer.main;

import farmacie.observer.model.Client;
import farmacie.observer.model.Farmacie;
import farmacie.observer.model.Observer;

public class Main {
    public static void main(String[] args) {
        Farmacie farmacie = new Farmacie("Catena");

        Observer client1 = new Client("Bianca");
        Observer client2 = new Client("Ana");

        farmacie.adaugaObserver(client1);
        farmacie.adaugaObserver(client2);
        farmacie.notificareOfertaPret();
    }
}
