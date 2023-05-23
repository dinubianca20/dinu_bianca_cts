package farmacie.state.model;

public class Reteta {

    private String denumireReteta;
    private IStare stare;

    public Reteta(String denumireReteta) {
        this.denumireReteta = denumireReteta;
        this.stare = new StareEmisa();
    }

    public IStare getStare() {
        return stare;
    }

    public void setStare(IStare stare) {
        this.stare = stare;
    }

    public void emisReteta() {
        IStare stare = new StareEmisa();
        stare.modificaStare(this);
    }

    public void solicitaReteta() {
        IStare stare = new StareSolicitata();
        stare.modificaStare(this);
    }

    public void achizitioneazaReteta() {
        IStare stare = new StareAchizitionata();
        stare.modificaStare(this);
    }
}
