package farmacie.state.model;

public class StareAchizitionata implements IStare{
    @Override
    public void modificaStare(Reteta reteta) {
        if(reteta.getStare() instanceof StareSolicitata) {
            System.out.println("Reteta a fost achizitionata!");
            reteta.setStare(this);
        }
    }
}
