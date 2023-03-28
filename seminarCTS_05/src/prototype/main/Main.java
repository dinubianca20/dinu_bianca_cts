package prototype.main;

import prototype.model.Prototype;
import prototype.model.Reteta;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Float> solutii = new HashMap<String, Float>();
        solutii.put("solutia1", (float)40);
        solutii.put("solutia2", (float)100);
        solutii.put("solutia3", (float)60);
        Prototype reteta1 = new Reteta("reteta1", (float)200, (HashMap<String, Float>) solutii);

        Prototype retetaLaborator = reteta1.clonare();
        Prototype retetaPacient = reteta1.clonare();
        System.out.println(retetaLaborator.toString());
    }
}
