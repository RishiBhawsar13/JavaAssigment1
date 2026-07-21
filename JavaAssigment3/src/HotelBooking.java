class HotelBooking {
    private String guestName;
    private double roomPrice;
    private int nights;

    public void setData(String g, double r, int n) {
        guestName = g;
        roomPrice = r;
        nights = n;
    }

    public void display() {
        double bill = roomPrice * nights;

        if (nights >= 7)
            bill -= bill * 0.15;

        System.out.println("Guest = " + guestName);
        System.out.println("Bill = " + bill);
    }
}

public class Main {
    public static void main(String[] args) {
        HotelBooking h = new HotelBooking();
        h.setData("Amit", 2500, 8);
        h.display();
    }
}
