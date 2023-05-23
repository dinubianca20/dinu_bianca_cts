package restaurant.decorator.model;

import javax.sound.midi.Soundbank;

public class NotaDePlata implements INotaDePlata{

    private double valoareNota;

    public NotaDePlata(double valoareNota) {
        this.valoareNota = valoareNota;
    }

    @Override
    public void printeazaNota() {
        System.out.println("Nota de plata este in valoare de " + this.valoareNota);
    }
}
