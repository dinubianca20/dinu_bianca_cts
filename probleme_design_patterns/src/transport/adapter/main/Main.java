package transport.adapter.main;

import transport.adapter.model.*;

public class Main {
    public static void imprima(ISoftTransportComun softTransportComun) {
        softTransportComun.cumparaBilet();
    }
    public static void main(String[] args) {

        ISoftMetrou softMetrou = new SoftMetrou("Gara de Nord");
        softMetrou.cumparaBiletMetrou();
        //Main.imprima(softMetrou); nu merge

        ISoftTransportComun softTransportComun = new SoftTransportComun(4);
        softTransportComun.cumparaBilet();
        Main.imprima(softTransportComun);

        //adapter de obiecte
        AdapterObiecte adapterObiecte = new AdapterObiecte(softMetrou);
        Main.imprima(adapterObiecte);

        AdapterClase adapterClase = new AdapterClase("Gara de Nord");
        Main.imprima(adapterClase);
    }
}
