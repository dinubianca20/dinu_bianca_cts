package banca.factory_method.model;

public class FactoryPersoanaFizica implements Factory{
    @Override
    public IPersoana crearePersoana() {
        return new PersoanaFizica();
    }
}
