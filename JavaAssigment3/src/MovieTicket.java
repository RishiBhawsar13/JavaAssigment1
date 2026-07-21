class MovieTicket {
    private String movieName;
    private double ticketPrice;
    private int tickets;

    public void setData(String m, double p, int t) {
        movieName = m;
        ticketPrice = p;
        tickets = t;
    }

    public void display() {
        double total = ticketPrice * tickets;

        if (tickets >= 5)
            total -= total * 0.05;

        System.out.println(movieName);
        System.out.println("Total = " + total);
    }
}

public class Main {
    public static void main(String[] args) {
        MovieTicket m = new MovieTicket();
        m.setData("Avengers", 250, 5);
        m.display();
    }
}