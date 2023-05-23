package probleme_test.s1.adapter.model;

public class Ticket {
    private String movieTitle;
    private String movieDate;
    private String time;
    private String seat;

    public Ticket(String movieTitle, String movieDate, String time, String seat) {
        this.movieTitle = movieTitle;
        this.movieDate = movieDate;
        this.time = time;
        this.seat = seat;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieDate() {
        return movieDate;
    }

    public String getTime() {
        return time;
    }

    public String getSeat() {
        return seat;
    }
}
