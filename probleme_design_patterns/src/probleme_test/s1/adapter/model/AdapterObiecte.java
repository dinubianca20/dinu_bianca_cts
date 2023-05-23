package probleme_test.s1.adapter.model;

public class AdapterObiecte implements ISoftCasierie{

    private OnlineBooking onlineBooking;

    public AdapterObiecte(OnlineBooking onlineBooking) {
        this.onlineBooking = onlineBooking;
    }

    @Override
    public void afiseazaBilet() {
        this.onlineBooking.showOrderDetails();
    }
}
