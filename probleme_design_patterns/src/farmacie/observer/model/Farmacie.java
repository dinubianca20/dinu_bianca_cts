package farmacie.observer.model;

import java.util.ArrayList;
import java.util.List;

public class Farmacie implements IFarmacie{

    private String denumireFarmacie;
    private List<Observer> observerList;

    public Farmacie(String denumireFarmacie) {
        this.denumireFarmacie = denumireFarmacie;
        this.observerList = new ArrayList<>();
    }

    @Override
    public void adaugaObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void dezaboneazaObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notificaObserver(String mesaj) {
        for(Observer o : observerList) {
            o.receptioneazaNotificare(mesaj);
        }
    }

    public void notificareOfertaPret() {
        notificaObserver("Farmacia " + this.denumireFarmacie + " a adaugat oferte noi de pret");
    }
}
