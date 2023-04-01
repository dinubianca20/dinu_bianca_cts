package singleton.lazy_initialization;

public class Administrator {
    private String nume;
    private int varsta;

    private static Administrator instanta = null;

    private Administrator(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public static Administrator getInstance(String nume, int varsta) {
        if (instanta==null) {
            instanta = new Administrator(nume, varsta);
        }
        return instanta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}
