package builder.model;

public class BuilderPacient implements IBuilder {

    Pacient pacient;

    public BuilderPacient(String nume) {
       this.pacient = new Pacient(nume, false, false, false, false);
    }
    @Override
    public BuilderPacient setNume(String nume) {
        throw new IllegalArgumentException("Not Aplicable!");
    }
    @Override
    public BuilderPacient setHasPatRabatabil(boolean hasPatRabatabil) {
        pacient.setHasPatRabatabil(hasPatRabatabil);
        return this;
    }
    @Override
    public BuilderPacient setHasMicDejun(boolean hasMicDejun) {
        pacient.setHasMicDejun(hasMicDejun);
        return this;
    }
    @Override
    public BuilderPacient setHasPapuciCamera(boolean hasPapuciCamera) {
        pacient.setHasPapuciCamera(hasPapuciCamera);
        return this;
    }
    @Override
    public BuilderPacient setHasHalatPentruInterior(boolean hasHalatPentruInterior) {
        pacient.setHasHalatPentruInterior(hasHalatPentruInterior);
        return this;
    }

    @Override
    public Pacient build() {
        return pacient;
    }
}
