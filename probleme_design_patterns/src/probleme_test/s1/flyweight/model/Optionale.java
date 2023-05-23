package probleme_test.s1.flyweight.model;

public class Optionale {

    private String date;
    private String hour;
    private String loc;

    public Optionale(String date, String hour, String loc) {
        this.date = date;
        this.hour = hour;
        this.loc = loc;
    }

    public String getDate() {
        return date;
    }

    public String getHour() {
        return hour;
    }

    public String getLoc() {
        return loc;
    }
}
