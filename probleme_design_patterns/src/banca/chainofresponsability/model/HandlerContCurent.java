package banca.chainofresponsability.model;

public class HandlerContCurent extends HandlerCont{
    public HandlerContCurent(float sumaCont) {
        super(sumaCont);
    }

    @Override
    public void notifica(Client client) {
        if(client.getSumaDorita() > getSumaCont()) {
            System.out.println("");
        }
    }
}
