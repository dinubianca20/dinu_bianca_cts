package state.model;

public class StareLaReparat implements IStare{
    @Override
    public void schimbareStare(Autobuz autobuz) {
        if(autobuz.getStare() instanceof StareLaCapatDeLinie) {
            System.out.println("Autobuzul " + autobuz.getNumarInmatriculare() + " a ajuns la reparatii.");
            autobuz.setStare(this);
        } else {
            System.out.println("Autobuzul " + autobuz.getNumarInmatriculare() + "nu poate intra in service.");
        }
    }
}
