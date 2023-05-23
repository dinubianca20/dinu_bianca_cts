package banca.proxy.main;

import banca.proxy.model.Credit;
import banca.proxy.model.ICredit;
import banca.proxy.model.ProxyCredit;

public class Main {
    public static void main(String[] args) {
        ICredit credit = new Credit("cont1");
        credit.realizeazaCredit("EURO");

        ICredit credit2 = new ProxyCredit(credit);
        credit2.realizeazaCredit("RON");
        credit2.realizeazaCredit("EURO");
    }
}
