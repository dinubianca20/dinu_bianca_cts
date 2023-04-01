package singleton.enum_model;

public enum Administrator {
    instanta;
    private String nume;
    private int varsta;

    private Administrator() {
        this.nume = "Gigel";
        this.varsta = 30;
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
