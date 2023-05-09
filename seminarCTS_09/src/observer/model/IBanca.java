package observer.model;

public interface IBanca {
    void adaugaObserver(IClient observer);
    void stergeObserver(IClient observer);
    void notifica(String mesaj);
}
