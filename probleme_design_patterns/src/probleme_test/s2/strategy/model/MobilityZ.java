package probleme_test.s2.strategy.model;

public class MobilityZ implements Subscription{
    @Override
    public float totalCosts(int durationInMonths) {
        return 50*durationInMonths;
    }
}
