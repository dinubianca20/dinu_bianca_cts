package farmacie.state.model;

public class StareEmisa implements IStare{
    @Override
    public void modificaStare(Reteta reteta) {
        System.out.println("Reteta a fost emisa!");
        reteta.setStare(this);
    }
}
