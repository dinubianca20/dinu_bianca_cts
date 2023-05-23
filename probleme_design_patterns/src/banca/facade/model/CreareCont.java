package banca.facade.model;

public class CreareCont {

    private Persoana persoana;

    public CreareCont(Persoana persoana) {
        this.persoana = persoana;
    }

    public void verificaVarstaPersoana(){
        if(persoana.getVarsta() >=18) {
            System.out.println("S-a verificat varsta persoanei " + persoana.getNumePersoana());
        }
        else {
            System.out.println("Persoana " + persoana.getNumePersoana() + " nu are 18 ani!");
        }
    }
    public void verificaPolitie() {
        if(persoana.isAreCazier()) {
            System.out.println("Persoana " + persoana.getNumePersoana() + " nu are cazier.");
        }
        else {
            System.out.println("Persoana " + persoana.getNumePersoana() + " are cazier.");
        }
    }

    public void areCreante() {
        if(persoana.isAreCreante()) {
            System.out.println("Persoana " + persoana.getNumePersoana() + " nu are creante.");
        }
        else {
            System.out.println("Persoana " + persoana.getNumePersoana() + " are creante.");
        }
    }
}
