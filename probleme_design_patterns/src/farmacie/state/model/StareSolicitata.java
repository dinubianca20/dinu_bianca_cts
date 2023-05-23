package farmacie.state.model;

public class StareSolicitata implements IStare{
    @Override
    public void modificaStare(Reteta reteta) {
        if(reteta.getStare() instanceof StareEmisa) {
            System.out.println("Reteta a fost solicitata la farmacie");
            reteta.setStare(this);
        }
    }
}
