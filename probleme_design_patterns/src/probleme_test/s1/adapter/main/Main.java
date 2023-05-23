package probleme_test.s1.adapter.main;

import probleme_test.s1.adapter.model.*;

public class Main {
    public static void imprima(ISoftCasierie softCasierie) {
        softCasierie.afiseazaBilet();
    }
    public static void main(String[] args) {
        Ticket ticket = new Ticket("Barbie", "12/07/2023", "13:30", "14G");

        OnlineBooking onlineBooking = new SoftOnlineBooking(ticket);
        onlineBooking.showOrderDetails();
        //Main.imprima(onlineBooking);

        ISoftCasierie softCasierie = new SoftCasierie(ticket);
        //softCasierie.afiseazaBilet();
        //Main.imprima(softCasierie);

        //adapter obiecte
        AdapterObiecte adapterObiecte = new AdapterObiecte(onlineBooking);
        //Main.imprima(adapterObiecte);
    }
}
