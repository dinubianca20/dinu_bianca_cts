package spital.facade.main;

import spital.facade.model.FacadeSpital;

public class Main {
    public static void main(String[] args) {
        FacadeSpital facadeSpital = new FacadeSpital();
        System.out.println(facadeSpital.verificaPacient(1,4));
        System.out.println(facadeSpital.verificaPacient(2,15));
        System.out.println(facadeSpital.verificaPacient(3,5));
    }
}
