package probleme_test.s2.strategy.model;

public class MobilityY implements Subscription{
    @Override
    public float totalCosts(int durationInMonths) {
        return 45*durationInMonths;
    }
}
