package builder.model;

public class Pacient {
    private String nume;
    private boolean hasPatRabatabil;
    private boolean hasMicDejun;
    private boolean hasPapuciCamera;
    private boolean hasHalatPentruInterior;

    protected Pacient(String nume, boolean hasPatRabatabil, boolean hasMicDejun, boolean hasPapuciCamera, boolean hasHalatPentruInterior) {
        this.nume = nume;
        this.hasPatRabatabil = hasPatRabatabil;
        this.hasMicDejun = hasMicDejun;
        this.hasPapuciCamera = hasPapuciCamera;
        this.hasHalatPentruInterior = hasHalatPentruInterior;
    }

    public Pacient(String nume) {
        this.nume = nume;
        this.hasMicDejun = false;
        this.hasPapuciCamera = false;
        this.hasHalatPentruInterior = false;
        this.hasPatRabatabil = false;
    }

    protected void setNume(String nume) {
        this.nume = nume;
    }

    protected void setHasPatRabatabil(boolean hasPatRabatabil) {
        this.hasPatRabatabil = hasPatRabatabil;
    }

    protected void setHasMicDejun(boolean hasMicDejun) {
        this.hasMicDejun = hasMicDejun;
    }

    protected void setHasPapuciCamera(boolean hasPapuciCamera) {
        this.hasPapuciCamera = hasPapuciCamera;
    }

    protected void setHasHalatPentruInterior(boolean hasHalatPentruInterior) {
        this.hasHalatPentruInterior = hasHalatPentruInterior;
    }

    @Override
    public String toString() {
        return "Pacient {" +
                "nume='" + nume + '\'' +
                ", hasPatRabatabil=" + hasPatRabatabil +
                ", hasMicDejun=" + hasMicDejun +
                ", hasPapuciCamera=" + hasPapuciCamera +
                ", hasHalatPentruInterior=" + hasHalatPentruInterior +
                '}';
    }
}
