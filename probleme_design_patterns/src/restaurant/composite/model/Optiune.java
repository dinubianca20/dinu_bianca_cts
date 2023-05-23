package restaurant.composite.model;

public interface Optiune {

    void adaugaOptiune(Optiune o);
    void stergeOptiune(Optiune o);
    Optiune getIndex(int index);
    void descriere();
}
