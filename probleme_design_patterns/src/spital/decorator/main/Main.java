package spital.decorator.main;

import spital.decorator.model.Decorator;
import spital.decorator.model.DecoratorOnline;
import spital.decorator.model.IPrintare;
import spital.decorator.model.PrintareRezultate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Fara decorator");

        IPrintare rezultat = new PrintareRezultate("acceptat");
        rezultat.printare();

        System.out.println("Cu decorator");
        Decorator decoratorOnline = new DecoratorOnline(rezultat);
        decoratorOnline.trimitereOnline();
    }
}
