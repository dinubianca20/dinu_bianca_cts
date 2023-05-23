package banca.chainofresponsability.model;

public abstract class HandlerCont {

    private HandlerCont urmatorulCont;
    private float sumaCont;

    public HandlerCont(float sumaCont) {
        this.sumaCont = sumaCont;
    }

    public float getSumaCont() {
        return sumaCont;
    }

    public HandlerCont getUrmatorulCont() {
        return urmatorulCont;
    }

    public void setUrmatorulCont(HandlerCont urmatorulCont) {
        this.urmatorulCont = urmatorulCont;
    }

    public abstract void notifica(Client client);
}
