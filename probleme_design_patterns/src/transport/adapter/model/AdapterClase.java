package transport.adapter.model;

public class AdapterClase extends SoftMetrou implements ISoftTransportComun {
    public AdapterClase(String denumireStatie) {
        super(denumireStatie);
    }

    @Override
    public void cumparaBilet() {
        super.cumparaBiletMetrou();
    }
}
