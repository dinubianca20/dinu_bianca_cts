package restaurant.chainofresponsability.model;

public abstract class Handler {

    private Handler urmatorulHandler;

    public Handler getUrmatorulHandler() {
        return urmatorulHandler;
    }

    public void setUrmatorulHandler(Handler urmatorulHandler) {
        this.urmatorulHandler = urmatorulHandler;
    }

    public abstract void notifica(Client client, String mesaj);
}
