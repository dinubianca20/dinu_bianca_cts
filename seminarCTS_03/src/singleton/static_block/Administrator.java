package singleton.static_block;

public class Administrator {
    private String nume;
    private int varsta;

    private static Administrator instanta;

    static {
        try{
            instanta = new Administrator();
        }
        catch(Exception exception) {
            System.out.println("Not returnable!");
        }
    }

    private Administrator() {
        this.nume = "Gigel";
        this.varsta = 30;
    }

    public static Administrator getInstance(String nume, int varsta) {
        return instanta;
    }
}
