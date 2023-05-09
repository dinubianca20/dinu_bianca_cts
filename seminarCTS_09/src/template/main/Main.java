package template.main;

import template.model.Bancomat;
import template.model.BancomatAbstract;
import template.model.BancomatBitcoin;

public class Main {
    public static void main(String[] args) {
        BancomatAbstract bancomat = new Bancomat("Papucesti");
        bancomat.scoateBaniDeLaBancomat(400);
        System.out.println();
        BancomatAbstract bancomatBitcoin = new BancomatBitcoin("Bobana");
        bancomatBitcoin.scoateBaniDeLaBancomat(1);
    }
}
