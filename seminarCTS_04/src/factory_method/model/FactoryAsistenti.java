package factory_method.model;

public class FactoryAsistenti implements Factory{

    @Override
    public PersonalSpital crearePersonal(String nume) {
        return new Asistent(nume);
    }
}
