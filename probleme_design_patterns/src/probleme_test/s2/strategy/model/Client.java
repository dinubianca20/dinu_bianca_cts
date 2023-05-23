package probleme_test.s2.strategy.model;

public class Client {

    private Subscription subscription;

    public Client() {
        this.subscription = new MobilityX();
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public void achizitioneazaAbonament(int months) {
        System.out.println("Abonamentul are un total de "+subscription.totalCosts(months));
    }
}
