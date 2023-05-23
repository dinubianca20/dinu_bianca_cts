package probleme_test.s1.flyweight.model;

import java.util.HashMap;

public class FlyweightFamily {

    HashMap<String, FlyweightConcret> listaFilme;

    public FlyweightFamily() {
        this.listaFilme = new HashMap<>();
    }

    public FlyweightConcret getTicket(String titlu, String regie) {
        if(listaFilme.containsKey(titlu)) {
            return listaFilme.get(titlu);
        }
        else{
            FlyweightConcret biletNou = new FlyweightConcret(titlu, regie);
            listaFilme.put(titlu,biletNou);
            return biletNou;
        }
    }
}
