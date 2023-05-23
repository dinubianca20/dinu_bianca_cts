package spital.facade.model;

public class Pacient {

    private int codPacient;
    private String nume;
    private boolean stareGravitate;

    public Pacient(int codPacient, String nume, boolean stareGravitate) {
        this.codPacient = codPacient;
        this.nume = nume;
        this.stareGravitate = stareGravitate;
    }

    public boolean isStareGravitate() {
        return stareGravitate;
    }

    public int getCodPacient() {
        return codPacient;
    }
}
