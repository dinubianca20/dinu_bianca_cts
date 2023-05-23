package restaurant.decorator.model;

public abstract class Decorator implements INotaDePlata {

    private INotaDePlata notaDePlata;

    public Decorator(INotaDePlata notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    public INotaDePlata getNotaDePlata() {
        return notaDePlata;
    }


    public void printeazaNota() {
        notaDePlata.printeazaNota();
        printeazaMesaj();
    }

    public abstract void printeazaMesaj();
}
