package probleme_test.s1.flyweight.main;


import probleme_test.s1.flyweight.model.FlyweightFamily;
import probleme_test.s1.flyweight.model.Optionale;

public class Main {
    public static void main(String[] args) {
        FlyweightFamily family = new FlyweightFamily();

        //optionale
        Optionale optionale1 = new Optionale("12/12/2012","13:30", "45");
        Optionale optionale2 = new Optionale("14/12/2012","16:30", "6");

        family.getTicket("Batman", "Regie1").descriereBilet(optionale1);
        family.getTicket("2012","Regie2").descriereBilet(optionale2);
    }
}
