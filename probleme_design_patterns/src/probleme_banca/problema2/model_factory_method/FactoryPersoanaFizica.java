package probleme_banca.problema2.model_factory_method;

public class FactoryPersoanaFizica implements Factory{
    @Override
    public IPersoana crearePersoana() {
        return new PersoanaFizica();
    }
}
