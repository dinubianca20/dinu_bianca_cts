package spital.facade.model;

import java.util.ArrayList;
import java.util.List;

public class Salon {

    private List<Boolean> listaPaturiDisponibile;

    public Salon() {
        this.listaPaturiDisponibile = new ArrayList<Boolean>();
        for(int i=0;i<10;i++) {
            listaPaturiDisponibile.add(true);
        }
        for(int i= 10; i <20;i++) {
            listaPaturiDisponibile.add(false);
        }
    }

    public boolean esteLiber(int codPat) {
        return listaPaturiDisponibile.get(codPat);
    }


}
