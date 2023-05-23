package farmacie.strategy.model;

public class PlataCard implements IStrategy{
    @Override
    public void plateste() {
        System.out.println("S-a platit cu cardul!");
    }
}
