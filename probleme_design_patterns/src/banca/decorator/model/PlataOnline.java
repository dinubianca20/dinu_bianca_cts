package banca.decorator.model;

public class PlataOnline implements IPlata{
    @Override
    public void realizeazaPlata() {
        System.out.println("Plata a fost realizata cu cardul online!");
    }
}
