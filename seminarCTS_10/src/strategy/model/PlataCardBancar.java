package strategy.model;

public class PlataCardBancar implements TipPlata{
    @Override
    public void plateste(double pretBilet) {
        System.out.println("Plata a fost realizata cu cardul bancar, in valoare de " + pretBilet);
    }
}
