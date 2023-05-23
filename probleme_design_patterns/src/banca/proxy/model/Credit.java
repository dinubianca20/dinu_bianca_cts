package banca.proxy.model;

public class Credit implements ICredit{

    private String denumireCont;

    public Credit(String denumireCont) {
        this.denumireCont = denumireCont;
    }

    public String getDenumireCont() {
        return denumireCont;
    }

    @Override
    public void realizeazaCredit(String moneda) {
        System.out.println("Contul " + this.denumireCont+" a fost realizat in moneda " + moneda);
    }
}
