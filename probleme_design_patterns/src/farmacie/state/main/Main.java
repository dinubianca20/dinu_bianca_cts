package farmacie.state.main;

import farmacie.state.model.Reteta;

public class Main {
    public static void main(String[] args) {

        Reteta reteta = new Reteta("reteta1");

       reteta.emisReteta();
       reteta.solicitaReteta();
       reteta.achizitioneazaReteta();
    }
}
