package restaurant.chainofresponsability.model;

public class HandlerManager extends Handler{
    @Override
    public void notifica(Client client, String mesaj) {
        System.out.println("Clientul " + client.getNume() + " nu are in baza de date email si numar de telefon.");
    }
}
