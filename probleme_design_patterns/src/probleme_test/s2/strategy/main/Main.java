package probleme_test.s2.strategy.main;

import probleme_test.s2.strategy.model.Client;
import probleme_test.s2.strategy.model.MobilityY;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();

        client.achizitioneazaAbonament(30);
        client.setSubscription(new MobilityY());
        client.achizitioneazaAbonament(45);
    }
}
