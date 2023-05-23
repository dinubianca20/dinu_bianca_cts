package banca.simple_factory.main;

import banca.simple_factory.model.Factory;
import banca.simple_factory.model.ICredit;
import banca.simple_factory.model.TipCredit;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

        List<ICredit> listaCredite = new ArrayList<>();
        listaCredite.add(factory.createObject(TipCredit.CREDIT_IPOTECAR, "Credit1", 10000));
        listaCredite.add(factory.createObject(TipCredit.CREDIT_NEVOI_PERSONALE, "Credit2", 15000));
        listaCredite.add(factory.createObject(TipCredit.CREDIT_IPOTECAR, "Credit3", 100000));

        System.out.println("Afisare lista credite");
        for(ICredit credit : listaCredite) {
            credit.descriere();
        }
    }
}
