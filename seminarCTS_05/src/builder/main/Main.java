package builder.main;

import builder.model.BuilderPacient;
import builder.model.BuilderPacientV2;
import builder.model.IBuilder;
import builder.model.Pacient;

public class Main {
    public static void main(String[] args) {

        BuilderPacient builderPacient = new BuilderPacient("Mihai");
        Pacient pacient1;
        Pacient pacient2;
        pacient1 = builderPacient.setHasHalatPentruInterior(true).build();
        pacient2 = builderPacient.setHasMicDejun(true).build();

        System.out.println(pacient1.toString());
        System.out.println(pacient2.toString());

        //MAIN VARIANTA BUILDERPACIENTV2
        IBuilder builderPacient2 = new BuilderPacientV2();
        Pacient pacient3 = builderPacient2.setNume("Gigi").setHasMicDejun(true).build();
        Pacient pacient4 = builderPacient2.setNume("Aspasia").build();

        System.out.println(pacient3.toString());
        System.out.println(pacient4.toString());

    }
}
