package builder.model;

public interface IBuilder {

    public Pacient build();

    public IBuilder setNume(String nume);

    public IBuilder setHasPatRabatabil(boolean hasPatRabatabil);

    public IBuilder setHasMicDejun(boolean hasMicDejun);

    public IBuilder setHasPapuciCamera(boolean hasPapuciCamera);

    public IBuilder setHasHalatPentruInterior(boolean hasHalatPentruInterior);
}
