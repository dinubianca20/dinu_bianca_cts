package transport.adapter.model;

public class SoftMetrou implements ISoftMetrou{

    private String denumireStatie;

    public SoftMetrou(String denumireStatie) {
        this.denumireStatie = denumireStatie;
    }

    @Override
    public void cumparaBiletMetrou() {
        System.out.println("Biletul a fost cumparat la statia de metrou " + this.denumireStatie);
    }
}
