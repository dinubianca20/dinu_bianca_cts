package prototype.model;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements Prototype {

    private String numeReteta;
    private Float gramajMedicament;
    private Map<String, Float> solutii;

    public Reteta(String numeReteta, Float gramajMedicament, HashMap<String, Float> solutii) {
        this.numeReteta = numeReteta;
        this.gramajMedicament = gramajMedicament;

        float sumaMedicament = 0;
        for(Float val : solutii.values()) {
            sumaMedicament+=val;
        }
        if(this.gramajMedicament == sumaMedicament) {
                this.solutii = solutii;
        }
        else {
            throw new IllegalArgumentException("Nu corespund gramajele!");
        }
    }

    private Reteta() {

    }

    @Override
    public Prototype clonare() {
        Reteta reteta = new Reteta();
        reteta.numeReteta = this.numeReteta;
        reteta.gramajMedicament = this.gramajMedicament;
        reteta.solutii = new HashMap<String, Float>();
        for(String val : this.solutii.keySet()) {
            reteta.solutii.put(val, this.solutii.get(val));
        }
        return reteta;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "numeReteta='" + numeReteta + '\'' +
                ", gramajMedicament=" + gramajMedicament +
                ", solutii=" + solutii +
                '}';
    }
}
