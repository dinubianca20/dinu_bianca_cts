package decorator.model;

public class BiletDecorat extends Decorator {
    public BiletDecorat(IBilet bilet) {
        super(bilet);
    }

    @Override
    public void printareMesajSustinere() {
        System.out.println("Sustinem echipa " + super.getBilet().getEchipaLocala());
    }


}
