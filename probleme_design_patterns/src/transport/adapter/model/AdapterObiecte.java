package transport.adapter.model;

public class AdapterObiecte implements ISoftTransportComun{

    private ISoftMetrou softMetrou;

    public AdapterObiecte(ISoftMetrou softMetrou) {
        this.softMetrou = softMetrou;
    }

    @Override
    public void cumparaBilet() {
        this.softMetrou.cumparaBiletMetrou();
    }
}
