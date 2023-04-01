package singleton.serialization;

import java.io.Serializable;

public class Administrator implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nume;
    private int varsta;

    private static Administrator instanta = null;

    private Administrator(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public static Administrator getInstance(String nume, int varsta) {
        if(instanta == null) {
            instanta = new Administrator(nume, varsta);
        }
        return instanta;
    }

    public Object readResolve() {
        return getInstance("Gigel", 30);
    }
}
