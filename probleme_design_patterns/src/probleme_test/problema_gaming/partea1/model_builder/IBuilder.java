package probleme_test.problema_gaming.partea1.model_builder;

public interface IBuilder {

    GamingConfiguration build();

    public IBuilder setHasMouse(boolean hasMouse);

    public IBuilder setHasTastatura(boolean hasTastatura);

    public IBuilder setHasCameraWEB(boolean hasCameraWEB);
}
