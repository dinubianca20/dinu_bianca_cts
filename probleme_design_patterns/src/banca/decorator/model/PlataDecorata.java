package banca.decorator.model;

public class PlataDecorata extends Decorator{
    public PlataDecorata(IPlata plata) {
        super(plata);
    }

    @Override
    public void platesteContactless() {
        System.out.println("Plata a fost realizata cu card contactless.");
    }
}
