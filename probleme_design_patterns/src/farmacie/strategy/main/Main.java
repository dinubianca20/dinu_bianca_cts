package farmacie.strategy.main;

import farmacie.strategy.model.Client;
import farmacie.strategy.model.PlataCard;
import farmacie.strategy.model.PlataCash;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Gigel");


        client.setStrategy(new PlataCard());
        client.achizitioneazaProduse();
        client.setStrategy(new PlataCash());
        client.achizitioneazaProduse();
    }
}
