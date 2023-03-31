package factory_method.model;

public class Asistent implements PersonalSpital {
    private String nume;

    protected Asistent(String nume) {
        this.nume = nume;
    }


    @Override
    public void descriere() {
        System.out.println("Numele asistentului este " + this.nume);
    }
}
