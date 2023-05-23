package banca.adapter.main;

import banca.adapter.model.*;

public class Main {
    public static void imprimare(ISoftBanca iSoftBanca, double valoare) {
        iSoftBanca.realizeazaCredit(valoare);
    }
    public static void main(String[] args) {

        ISoftLeasing softLeasing = new SoftLeasing("Leasing masina");
        softLeasing.oferaCreditLeasing(200);

        ISoftBanca softBanca = new SoftBanca("BCR");
        softBanca.realizeazaCredit(400);

        Main.imprimare(softBanca, 1000);
        //Main.imprimare(softLeasing,500); nu merge

        //folosim adapter de obiecte
        AdapterObiecte adapterObiecte = new AdapterObiecte(softLeasing);
        Main.imprimare(adapterObiecte, 400);

        //folosim adapter de clase
        AdapterClase adapterClase = new AdapterClase("Leasing masina 2");
        Main.imprimare(adapterClase, 235);
    }
}
