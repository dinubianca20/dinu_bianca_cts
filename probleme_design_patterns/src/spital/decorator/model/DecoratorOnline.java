package spital.decorator.model;

public class DecoratorOnline extends Decorator {

    public DecoratorOnline(IPrintare rezultat) {
        super(rezultat);
    }

    @Override
    public void trimitereOnline() {
        System.out.println("Rezultatele au fost trimise in format online.");
    }
}
