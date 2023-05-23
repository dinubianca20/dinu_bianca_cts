package restaurant.chainofresponsability.model;

public class HandlerEmail extends Handler {
    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getEmail()!=null) {
            System.out.println("Clientul " + client.getNume() + " a primit prin email urmatorul mesaj " + mesaj);
        }
        else {
            super.getUrmatorulHandler().notifica(client, mesaj);
        }
    }
}
