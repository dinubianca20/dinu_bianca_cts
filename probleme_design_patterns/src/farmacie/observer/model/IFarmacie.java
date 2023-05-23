package farmacie.observer.model;


public interface IFarmacie {
    void adaugaObserver(Observer o);
    void dezaboneazaObserver(Observer o);
    void notificaObserver(String mesaj);
}
