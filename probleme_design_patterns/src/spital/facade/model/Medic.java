package spital.facade.model;

import java.util.HashMap;
import java.util.Map;

public class Medic {

    private Map<Integer, Pacient> listaPacienti;

    public Medic() {
        this.listaPacienti = new HashMap<>();
    }

    public  void adaugaPacient(Pacient pacient) {
        listaPacienti.put(pacient.getCodPacient(), pacient);
    }

    public boolean confirmaInternarea(int codPacient) {
        return listaPacienti.containsKey(codPacient);
    }

    public boolean confirmaStarea(int codPacient) {
        return listaPacienti.get(codPacient).isStareGravitate();
    }
}
