package probleme_test.s1.adapter.model;

public class SoftOnlineBooking implements OnlineBooking{
    private Ticket ticket;

    public SoftOnlineBooking(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public String showOrderDetails() {
        return "Biletul de la filmul " + ticket.getMovieTitle() + " in data de " + ticket.getMovieDate() +
                ", ora " + ticket.getTime() + " si locul " + ticket.getSeat() + " a fost cumparat online!";
    }
}
