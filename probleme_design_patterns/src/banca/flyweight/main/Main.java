package banca.flyweight.main;

import banca.flyweight.model.FlyweightConcret;
import banca.flyweight.model.FlyweightFactory;
import banca.flyweight.model.IFlyweight;
import banca.flyweight.model.Optionale;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        //optionale
        Optionale optionale1 = new Optionale(3,1000);
        Optionale optionale2 = new Optionale(4,4000);

        factory.getClient(1,"Bianca", "082380434", "email1").descriereClient(optionale1);
        factory.getClient(2,"dcsc","cvwvf","vfdvd").descriereClient(optionale2);

    }
}
