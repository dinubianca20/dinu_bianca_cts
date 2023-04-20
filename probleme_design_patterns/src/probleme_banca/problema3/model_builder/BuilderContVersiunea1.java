package probleme_banca.problema3.model_builder;

public class BuilderContVersiunea1 implements Builder {

    private Cont cont;

    public BuilderContVersiunea1() {
        this.cont = new Cont("anonim", false, false, false);
    }

    @Override
    public Cont build() {
        return cont;
    }

    public BuilderContVersiunea1 setDenumire(String denumire) {
        this.cont.setDenumire(denumire);
        return this;
    }

    public BuilderContVersiunea1 setHasSalariu(boolean hasSalariu) {
        this.cont.setHasSalariu(hasSalariu);
        return this;
    }

    public BuilderContVersiunea1 setHasCardAtasat(boolean hasCardAtasat) {
        this.cont.setHasCardAtasat(hasCardAtasat);
        return this;
    }

    public BuilderContVersiunea1 setHasInternetBanking(boolean hasInternetBanking) {
        this.setHasInternetBanking(hasInternetBanking);
        return this;
    }


}
