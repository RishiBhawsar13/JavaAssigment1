class ElectricityBill {
    private String customerName;
    private int units;
    private double pricePerUnit;

    public void setData(String n, int u, double p) {
        customerName = n;
        units = u;
        pricePerUnit = p;
    }

    public void display() {
        double bill = units * pricePerUnit;

        if (units > 500)
            bill += bill * 0.10;

        System.out.println(customerName);
        System.out.println("Bill = " + bill);
    }
}

public class Main {
    public static void main(String[] args) {
        ElectricityBill e = new ElectricityBill();
        e.setData("Amit", 600, 8);
        e.display();
    }
}