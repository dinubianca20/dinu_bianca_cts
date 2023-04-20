package probleme_test.problema_gaming.partea2.model;

public class TesingModel implements ITesingModel{
    private String denumire;

    private static TesingModel instanta = null;

    public TesingModel(String denumire) {
        this.denumire = "testare";
    }

    public static synchronized TesingModel getInstance(String denumire) {
        if(instanta==null) {
            instanta = new TesingModel(denumire);
        } return instanta;
    }

    @Override
    public String test() {
        String string = "Instanta" + this.denumire;
        return string;
    }
}
