package spital.facade.model;

public class FacadeSpital {

    private Medic medic;
    private Salon salon;

    public FacadeSpital() {
        this.medic = new Medic();
        medic.adaugaPacient(new Pacient(1,"gigel",true));
        medic.adaugaPacient(new Pacient(2,"ionel",true));
        medic.adaugaPacient(new Pacient(3,"alex",false));

        this.salon = new Salon();

    }

    public String verificaPacient(int codPacient, int nrPat) {
        if(medic.confirmaStarea(codPacient) && medic.confirmaInternarea(codPacient)) {
            if(salon.esteLiber(nrPat)) {
                return "Pacientul cu codul " + codPacient + " va fi internat in patul " + nrPat;
            } else{
                return "Pacientul cu codul " + codPacient + " trebuie internat, dar patul " + nrPat +" nu este liber.";
            }
        }
        return "Pacientul nu trebuie internat.";
    }

}
