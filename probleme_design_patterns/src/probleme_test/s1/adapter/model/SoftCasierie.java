package probleme_test.s1.adapter.model;

public class SoftCasierie implements ISoftCasierie{

    private Ticket ticket;

    public SoftCasierie(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void afiseazaBilet() {
        System.out.println("Biletul de la filmul " + ticket.getMovieTitle() + " in data de " + ticket.getMovieDate() +
                ", ora " + ticket.getTime() + " si locul " + ticket.getSeat() + " a fost cumparat de la casierie!");
    }
}
