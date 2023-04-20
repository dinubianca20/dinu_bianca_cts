package probleme_test.problema_gaming.partea1.model_builder;

public class GamingConfigurationBuilderV2 implements IBuilder{

    private boolean hasPlacaDeBaza;
    private boolean hasMemorieRAM;
    private boolean hasStocareSSD;
    private boolean hasPlacaVideo;
    private boolean hasMouse;
    private boolean hasTastatura;
    private boolean hasCameraWEB;

    public GamingConfigurationBuilderV2() {
        this.hasPlacaDeBaza = true;
        this.hasMemorieRAM = true;
        this.hasStocareSSD = true;
        this.hasPlacaVideo = true;
        this.hasMouse = false;
        this.hasTastatura = false;
        this.hasCameraWEB = false;
    }

    @Override
    public GamingConfiguration build() {
        return new GamingConfiguration();
    }

    //
//    public IGamingSystem setHasPlacaDeBaza(boolean hasPlacaDeBaza) {
//        this.hasPlacaDeBaza = hasPlacaDeBaza;
//        return this;
//    }
//
//    public IGamingSystem setHasMemorieRAM(boolean hasMemorieRAM) {
//        this.hasMemorieRAM = hasMemorieRAM;
//        return this;
//    }
//
//    public IGamingSystem setHasStocareSSD(boolean hasStocareSSD) {
//        this.hasStocareSSD = hasStocareSSD;
//        return this;
//    }
//
//    public IGamingSystem setHasPlacaVideo(boolean hasPlacaVideo) {
//        this.hasPlacaVideo = hasPlacaVideo;
//        return this;
//    }
//
    public IBuilder setHasMouse(boolean hasMouse) {
        this.hasMouse = hasMouse;
        return this;
    }

    public IBuilder setHasTastatura(boolean hasTastatura) {
        this.hasTastatura = hasTastatura;
        return this;
    }

    public IBuilder setHasCameraWEB(boolean hasCameraWEB) {
        this.hasCameraWEB = hasCameraWEB;
        return this;
    }
}
