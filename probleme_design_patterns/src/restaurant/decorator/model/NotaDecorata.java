package restaurant.decorator.model;

public class NotaDecorata extends Decorator{
    public NotaDecorata(INotaDePlata notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaMesaj() {
        System.out.println("La multi ani!");
    }
}
