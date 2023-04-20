package probleme_banca.problema2.model_factory_method;

public class PersoanaFizica implements IPersoana {

    private String nume;
    private String cnp;
    private int varsta;

    public PersoanaFizica() {
    }

    public PersoanaFizica(String nume, String cnp, int varsta) {
        this.nume = nume;
        if(cnp.length()==13) {
            this.cnp = cnp;
        }
        else {
            throw new IllegalArgumentException("Cnp incorect!");
        }
        if(varsta > 18 && varsta <=60) {
            this.varsta = varsta;
        }
        else {
            throw new IllegalArgumentException("Varsta nepotrivita!");
        }

    }

    public String getNume() {
        return nume;
    }

    public String getCnp() {
        return cnp;
    }

    public int getVarsta() {
        return varsta;
    }


    @Override
    public void descriere() {
        System.out.println("Clientul " + this.getNume() + " este persoana fizica, cu cnp " + this.getCnp() +
                " si varsta " + this.getVarsta() + ".");
    }
}
