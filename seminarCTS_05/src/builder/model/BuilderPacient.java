package builder.model;

public class BuilderPacient implements IBuilder {

    Pacient pacient;

    public BuilderPacient(String nume) {

        this.pacient = new Pacient(nume, false, false, false, false);
    }

    public BuilderPacient setNume(String nume) {
        throw new IllegalArgumentException("Not Aplicable!");
    }

    public BuilderPacient setHasPatRabatabil(boolean hasPatRabatabil) {
        pacient.setHasPatRabatabil(hasPatRabatabil);
        return this;
    }

    public BuilderPacient setHasMicDejun(boolean hasMicDejun) {
        pacient.setHasMicDejun(hasMicDejun);
        return this;
    }

    public BuilderPacient setHasPapuciCamera(boolean hasPapuciCamera) {
        pacient.setHasPapuciCamera(hasPapuciCamera);
        return this;
    }

    public BuilderPacient setHasHalatPentruInterior(boolean hasHalatPentruInterior) {
        pacient.setHasHalatPentruInterior(hasHalatPentruInterior);
        return this;
    }

    @Override
    public Pacient build() {
        return pacient;
    }
}
