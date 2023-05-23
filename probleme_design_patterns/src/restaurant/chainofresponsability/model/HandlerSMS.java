package restaurant.chainofresponsability.model;

public class HandlerSMS extends Handler {
    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getNumarTelefon()!=null) {
            System.out.println("Clientul " + client.getNume() + " a primit prin SMS urmatorul mesaj " + mesaj);
        }
        else {
            super.getUrmatorulHandler().notifica(client, mesaj);
        }
    }
}
