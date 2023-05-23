package farmacie.strategy.model;


public class PlataCash implements IStrategy {
    @Override
    public void plateste() {
        System.out.println("S-a platit cash!");
    }
}
