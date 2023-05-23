package banca.decorator.model;

public class PlataFizic implements IPlata{
    @Override
    public void realizeazaPlata() {
        System.out.println("Plata a fost realizata cu cardul fizic!");
    }
}
