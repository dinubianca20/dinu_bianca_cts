package banca.facade.model;

public class Persoana {

    private String numePersoana;
    private int varsta;
    private boolean areCazier;
    private boolean areCreante;

    public Persoana(String numePersoana, int varsta, boolean areCazier, boolean areCreante) {
        this.numePersoana = numePersoana;
        this.varsta = varsta;
        this.areCazier = areCazier;
        this.areCreante = areCreante;
    }

    public String getNumePersoana() {
        return numePersoana;
    }

    public int getVarsta() {
        return varsta;
    }

    public boolean isAreCazier() {
        return areCazier;
    }

    public boolean isAreCreante() {
        return areCreante;
    }
}
