package banca.adapter.model;

public class SoftBanca implements ISoftBanca {

    private String denumireBanca;

    public SoftBanca(String denumireBanca) {
        this.denumireBanca = denumireBanca;
    }


    @Override
    public void realizeazaCredit(double valoareCredit) {
        System.out.println("Banca " + this.denumireBanca + " acorda un credit in valoare de " + valoareCredit);
    }
}
