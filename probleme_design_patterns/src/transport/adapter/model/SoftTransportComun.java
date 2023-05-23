package transport.adapter.model;

public class SoftTransportComun implements ISoftTransportComun {

    private int codBilet;

    public SoftTransportComun(int codBilet) {
        this.codBilet = codBilet;
    }

    @Override
    public void cumparaBilet() {
        System.out.println("Biletul cu " + this.codBilet +" a fost cumparat!");
    }
}
