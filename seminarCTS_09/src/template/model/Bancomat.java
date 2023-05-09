package template.model;

public class Bancomat extends BancomatAbstract{


    public Bancomat(String adresa) {
        super(adresa);
    }

    @Override
    protected void introduceCard() {
        System.out.println("A fost introdus cardul in bancomatul din " + super.getAdresa());
    }

    @Override
    protected void introducePIN() {
        System.out.println("A fost introdus PIN-ul in bancomatul din " + super.getAdresa());
    }

    @Override
    protected void specificareSuma(int suma) {
        System.out.println("A fost specificata pentru retragere suma de " +suma+" in bancomatul din " + super.getAdresa());
    }

    @Override
    protected void retrageSuma() {
        System.out.println("A fost retrasa suma din bancomatul din " + super.getAdresa());
    }

    @Override
    protected void retrageCard() {
        System.out.println("A fost retras cardul!");
    }
}
