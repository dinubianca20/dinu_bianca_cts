package template.model;

public class BancomatBitcoin extends BancomatAbstract{
    public BancomatBitcoin(String adresa) {
        super(adresa);
    }

    @Override
    protected void introduceCard() {
        System.out.println("A fost introdus cardul Bitcoin din " + super.getAdresa());
    }

    @Override
    protected void introducePIN() {
        System.out.println("A fost PIN-ul pentru cardul Bitcoin din " + super.getAdresa());
    }

    @Override
    protected void specificareSuma(int suma) {
        System.out.println("A fost specificata suma criptomoneda de " + suma +" pentru retragere");
    }

    @Override
    protected void retrageSuma() {
        System.out.println("A fost retrasa suma din " + super.getAdresa());
    }

    @Override
    protected void retrageCard() {
        System.out.println("A fost retras cardul!");
    }
}
