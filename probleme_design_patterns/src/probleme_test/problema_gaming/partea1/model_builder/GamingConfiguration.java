package probleme_test.problema_gaming.partea1.model_builder;

public class GamingConfiguration implements IGamingSystem {
    private boolean hasPlacaDeBaza;
    private boolean hasMemorieRAM;
    private boolean hasStocareSSD;
    private boolean hasPlacaVideo;
    private boolean hasMouse;
    private boolean hasTastatura;
    private boolean hasCameraWEB;

    protected GamingConfiguration() {
        this.hasPlacaDeBaza = true;
        this.hasMemorieRAM = true;
        this.hasStocareSSD = true;
        this.hasPlacaVideo = true;
        this.hasMouse = false;
        this.hasTastatura = false;
        this.hasCameraWEB = false;
    }

//    protected void setHasPlacaDeBaza(boolean hasPlacaDeBaza) {
//        this.hasPlacaDeBaza = hasPlacaDeBaza;
//    }
//
//    protected void setHasMemorieRAM(boolean hasMemorieRAM) {
//        this.hasMemorieRAM = hasMemorieRAM;
//    }
//
//    protected void setHasStocareSSD(boolean hasStocareSSD) {
//        this.hasStocareSSD = hasStocareSSD;
//    }
//
//    protected void setHasPlacaVideo(boolean hasPlacaVideo) {
//        this.hasPlacaVideo = hasPlacaVideo;
//    }



    protected void setHasMouse(boolean hasMouse) {
        this.hasMouse = hasMouse;
    }

    protected void setHasTastatura(boolean hasTastatura) {
        this.hasTastatura = hasTastatura;
    }

    protected void setHasCameraWEB(boolean hasCameraWEB) {
        this.hasCameraWEB = hasCameraWEB;
    }

    @Override
    public String toString() {
        return "GamingConfiguration {" +
                "hasPlacaDeBaza=" + hasPlacaDeBaza +
                ", hasMemorieRAM=" + hasMemorieRAM +
                ", hasStocareSSD=" + hasStocareSSD +
                ", hasPlacaVideo=" + hasPlacaVideo +
                ", hasMouse=" + hasMouse +
                ", hasTastatura=" + hasTastatura +
                ", hasCameraWEB=" + hasCameraWEB +
                '}';
    }

    @Override
    public void printConfiguration() {
        System.out.println(this.toString());
    }
}
