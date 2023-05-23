package banca.builder.model;

public class Cont {
    private String denumire;
    private boolean hasSalariu;
    private boolean hasCardAtasat;
    private boolean hasInternetBanking;

    protected Cont(String denumire, boolean hasSalariu, boolean hasCardAtasat, boolean hasInternetBanking) {
        this.denumire = denumire;
        this.hasSalariu = hasSalariu;
        this.hasCardAtasat = hasCardAtasat;
        this.hasInternetBanking = hasInternetBanking;
    }

    protected void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    protected void setHasSalariu(boolean hasSalariu) {
        this.hasSalariu = hasSalariu;
    }

    protected void setHasCardAtasat(boolean hasCardAtasat) {
        this.hasCardAtasat = hasCardAtasat;
    }

    protected void setHasInternetBanking(boolean hasInternetBanking) {
        this.hasInternetBanking = hasInternetBanking;
    }

    @Override
    public String toString() {
        return "Cont {" +
                "denumire='" + denumire + '\'' +
                ", hasSalariu=" + hasSalariu +
                ", hasCardAtasat=" + hasCardAtasat +
                ", hasInternetBanking=" + hasInternetBanking +
                '}';
    }
}
