package banca.facade.model;

public class Facade {
    private CreareCont creareCont;

    public Facade(CreareCont creareCont) {
        this.creareCont = creareCont;
    }

    public void creareCont() {
        creareCont.verificaVarstaPersoana();
        creareCont.verificaPolitie();
        creareCont.areCreante();
    }
}
