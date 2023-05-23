package banca.simple_factory.model;

public class Factory {

    public ICredit createObject(TipCredit tip, String denumire, int valoare) {
        switch (tip) {
            case CREDIT_NEVOI_PERSONALE: return new CreditNevoiPersonale(denumire, valoare);
            case CREDIT_IPOTECAR: return new CreditIpotecar(denumire, valoare);
            default: return null;
        }
    }

}
