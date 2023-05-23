package banca.proxy.model;

public class ProxyCredit implements ICredit{

    private ICredit credit;

    public ProxyCredit(ICredit credit) {
        this.credit = credit;
    }

    @Override
    public void realizeazaCredit(String moneda) {
        if(moneda.equals("RON")) {
            this.credit.realizeazaCredit(moneda);
        }
        else {
            System.out.println("Moneda nu este in RON!");
        }
    }
}
