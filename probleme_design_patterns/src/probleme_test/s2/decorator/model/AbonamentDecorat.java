package probleme_test.s2.decorator.model;

public class AbonamentDecorat extends Decorator{

    private boolean internetRoaming;
    private boolean minuteRoaming;
    private boolean internet5G;

    public AbonamentDecorat(Abonament abonament, boolean internetRoaming, boolean minuteRoaming, boolean internet5G) {
        super(abonament);
        this.internetRoaming = internetRoaming;
        this.minuteRoaming = minuteRoaming;
        this.internet5G = internet5G;
    }

    @Override
    public float costTotalAbonament(int nrLuni) {
        float total = 0;
        if(internet5G!=false) {
            total+=10*nrLuni;
        }
        if(minuteRoaming) {
            total+= 15*nrLuni;
        }

        if(internetRoaming) {
            total+=20*nrLuni;
        }

        total+=super.getAbonament().getCostAbonament();

        return total;

    }
}
