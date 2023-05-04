package flyweight.model;

public class Spectator implements ISpectator {

    private float inaltime;
    private float latimeUmeri;
    private int id;

    public Spectator(float inaltime, float latimeUmeri, int id) {
        this.inaltime = inaltime;
        this.latimeUmeri = latimeUmeri;
        this.id = id;
    }

    @Override
    public void deseneazaSpectator(PozitieDesenare pd) {
        System.out.println(this.toString()+pd);
    }

    @Override
    public String toString() {
        return "Spectator{" +
                "inaltime=" + inaltime +
                ", latimeUmeri=" + latimeUmeri +
                ", id=" + id +
                '}';
    }
}
