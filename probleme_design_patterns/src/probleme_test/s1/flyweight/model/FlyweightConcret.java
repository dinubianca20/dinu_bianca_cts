package probleme_test.s1.flyweight.model;

public class FlyweightConcret implements Ticket{

    private String titlu;
    private String regie;

    public FlyweightConcret(String titlu, String regie) {
        this.titlu = titlu;
        this.regie = regie;
    }

    @Override
    public String print() {
        return "Filmul " + this.titlu +", regia " + this.regie;

    }

    public void descriereBilet(Optionale optionale) {
        System.out.println(print()+ ", loc " +optionale.getLoc()+", data " + optionale.getDate()+", ora "+optionale.getHour());
    }
}
