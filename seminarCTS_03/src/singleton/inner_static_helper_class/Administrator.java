package singleton.inner_static_helper_class;

public class Administrator {
    private String nume;
    private int varsta;

    private static class AdministratorHelper {
        private static final Administrator instanta = new Administrator();
    }
    private Administrator() {
        this.nume = "Gigel";
        this.varsta = 30;
    }

    public static Administrator getInstance(String nume, int varsta) {
        return AdministratorHelper.instanta;
    }

}
