class ShoppingCart {
    private String productName;
    private double price;
    private int quantity;

    public void setData(String p, double pr, int q) {
        productName = p;
        price = pr;
        quantity = q;
    }

    public void display() {
        double total = price * quantity;

        if (total > 5000)
            total -= total * 0.10;

        System.out.println(productName);
        System.out.println("Payable = " + total);
    }
}

public class Main {
    public static void main(String[] args) {
        ShoppingCart s = new ShoppingCart();
        s.setData("Laptop", 6000, 1);
        s.display();
    }
}