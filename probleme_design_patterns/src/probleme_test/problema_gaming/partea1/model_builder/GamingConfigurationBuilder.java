package probleme_test.problema_gaming.partea1.model_builder;

public class GamingConfigurationBuilder implements IBuilder{

    private GamingConfiguration gamingConfiguration;

    public GamingConfigurationBuilder() {
        this.gamingConfiguration = new GamingConfiguration();
    }

//    public GamingConfigurationBuilder setHasPlacaDeBaza(boolean hasPlacaDeBaza) {
//        this.gamingConfiguration.setHasPlacaDeBaza(hasPlacaDeBaza);
//        return this;
//    }
//
//    public GamingConfigurationBuilder setHasMemorieRAM(boolean hasMemorieRAM) {
//        this.gamingConfiguration.setHasMemorieRAM(hasMemorieRAM);
//        return this;
//    }
//
//    public GamingConfigurationBuilder setHasStocareSSD(boolean hasStocareSSD) {
//        this.gamingConfiguration.setHasStocareSSD(hasStocareSSD);
//        return this;
//    }
//
//    public GamingConfigurationBuilder setHasPlacaVideo(boolean hasPlacaVideo) {
//        this.gamingConfiguration.setHasPlacaVideo(hasPlacaVideo);
//        return this;
//    }

    public GamingConfigurationBuilder setHasMouse(boolean hasMouse) {
        this.gamingConfiguration.setHasMouse(hasMouse);
        return this;
    }

    public GamingConfigurationBuilder setHasTastatura(boolean hasTastatura) {
        this.gamingConfiguration.setHasTastatura(hasTastatura);
        return this;
    }

    public GamingConfigurationBuilder setHasCameraWEB(boolean hasCameraWEB) {
        this.gamingConfiguration.setHasCameraWEB(hasCameraWEB);
        return this;
    }

    @Override
    public GamingConfiguration build() {
        return this.gamingConfiguration;
    }
}
