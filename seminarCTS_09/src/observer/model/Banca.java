package observer.model;

import java.util.ArrayList;
import java.util.List;

public class Banca implements IBanca {
    //observabil concret
    private List<IClient> observari;
    private String numeBanca;

    public Banca(String numeBanca) {
        this.numeBanca = numeBanca;
        this.observari = new ArrayList<>();
    }

    @Override
    public void adaugaObserver(IClient observer) {
        this.observari.add(observer);
    }

    @Override
    public void stergeObserver(IClient observer) {
        this.observari.remove(observer);
    }

    @Override
    public void notifica(String mesaj) {
        for (IClient observar : observari) {
            observar.afiseazaMesaj(mesaj);
        }
    }
    public void adaugaTipCreditNou() {
        notifica(this.numeBanca + ":Am adaugat un nou tip de credit!");
    }

    public void actualizeazaAplicatia() {
        notifica(this.numeBanca + ":Am actualizat aplicatia!");
    }
}
