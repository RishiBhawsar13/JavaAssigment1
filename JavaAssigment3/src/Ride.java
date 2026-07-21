class Ride {
    private String customerName;
    private double distance, pricePerKm, surge;

    public void setData(String c, double d, double p, double s) {
        customerName = c;
        distance = d;
        pricePerKm = p;
        surge = s;
    }

    public void display() {
        double baseFare = distance * pricePerKm;
        double finalFare = baseFare * surge;

        if (distance > 20)
            finalFare -= finalFare * 0.10;

        if (surge > 1.5)
            finalFare += 50;

        System.out.println("Customer = " + customerName);
        System.out.println("Final Fare = " + finalFare);
    }
}

public class Main {
    public static void main(String[] args) {
        Ride r = new Ride();
        r.setData("Rishi", 25, 15, 1.8);
        r.display();
    }
}