package builder.model;

public interface IBuilder {

    public Pacient build();

    IBuilder setNume(String nume);

    IBuilder setHasPatRabatabil(boolean hasPatRabatabil);

    IBuilder setHasMicDejun(boolean hasMicDejun);

    IBuilder setHasPapuciCamera(boolean hasPapuciCamera);

    IBuilder setHasHalatPentruInterior(boolean hasHalatPentruInterior);
}
