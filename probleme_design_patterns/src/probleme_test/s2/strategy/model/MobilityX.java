package probleme_test.s2.strategy.model;

public class MobilityX implements Subscription {
    @Override
    public float totalCosts(int durationInMonths) {
        return 30*durationInMonths;
    }
}
