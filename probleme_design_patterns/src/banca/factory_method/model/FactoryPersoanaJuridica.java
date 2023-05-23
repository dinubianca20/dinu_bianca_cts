package banca.factory_method.model;

public class FactoryPersoanaJuridica implements Factory {

    @Override
    public IPersoana crearePersoana() {
        return new PersoanaJuridica();
    }
}
