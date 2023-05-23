package restaurant.chainofresponsability.main;

import restaurant.chainofresponsability.model.*;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Bianca", null,"email");

        HandlerSMS handlerSMS = new HandlerSMS();
        HandlerEmail handlerEmail = new HandlerEmail();
        HandlerManager handlerManager = new HandlerManager();

        handlerSMS.setUrmatorulHandler(handlerEmail);
        handlerEmail.setUrmatorulHandler(handlerManager);

        handlerSMS.notifica(client, "test");
    }
}
