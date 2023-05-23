package farmacie.strategy.model;

public class Client {
    private String nume;
    private IStrategy strategy;

    public Client(String nume) {
        this.nume = nume;
        strategy = new PlataCash();
    }

    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void achizitioneazaProduse() {
        strategy.plateste();
    }
}
