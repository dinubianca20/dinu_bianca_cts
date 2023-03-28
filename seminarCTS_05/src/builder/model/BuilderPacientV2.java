package builder.model;

public class BuilderPacientV2 implements IBuilder {
    private String nume;
    private boolean hasPatRabatabil;
    private boolean hasMicDejun;
    private boolean hasPapuciCamera;
    private boolean hasHalatPentruInterior;

    public BuilderPacientV2() {
        this.nume = "Anonim";
        this.hasPatRabatabil = false;
        this.hasMicDejun = false;
        this.hasPapuciCamera = false;
        this.hasHalatPentruInterior = false;
    }

    @Override
    public Pacient build() {
        return new Pacient(this.nume, this.hasPatRabatabil,this.hasMicDejun, this.hasPapuciCamera,
                this.hasHalatPentruInterior);
    }

    public IBuilder setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public IBuilder setHasPatRabatabil(boolean hasPatRabatabil) {
        this.hasPatRabatabil = hasPatRabatabil;
        return this;
    }

    public IBuilder setHasMicDejun(boolean hasMicDejun) {
        this.hasMicDejun = hasMicDejun;
        return this;
    }

    public IBuilder setHasPapuciCamera(boolean hasPapuciCamera) {
        this.hasPapuciCamera = hasPapuciCamera;
        return this;
    }

    public IBuilder setHasHalatPentruInterior(boolean hasHalatPentruInterior) {
        this.hasHalatPentruInterior = hasHalatPentruInterior;
        return this;
    }
}
