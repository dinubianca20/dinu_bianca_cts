package spital.decorator.model;

public class PrintareRezultate implements IPrintare{

    private String rezultat;

    public PrintareRezultate(String rezultat) {
        this.rezultat = rezultat;
    }

    @Override
    public void printare() {
        System.out.println("Rezultatul a fost printat!");
    }
}
