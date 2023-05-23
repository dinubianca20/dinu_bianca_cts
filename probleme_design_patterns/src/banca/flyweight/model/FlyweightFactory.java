package banca.flyweight.model;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    Map<Integer, IFlyweight> lista;

    public FlyweightFactory() {
        this.lista = new HashMap<>();
    }

    public IFlyweight getClient(int idClient, String nume, String nrTelefon, String email) {
        if(this.lista.get(idClient)!=null) {
            return this.lista.get(idClient);
        }
        else {
            IFlyweight client = new FlyweightConcret(idClient,nume,nrTelefon,email);
            this.lista.put(idClient, client);
            return client;
        }
    }
}
