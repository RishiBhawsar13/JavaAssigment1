class Library {
    private String bookName;
    private int daysLate;
    private double finePerDay;

    public void setData(String b, int d, double f) {
        bookName = b;
        daysLate = d;
        finePerDay = f;
    }

    public void display() {
        double fine = daysLate * finePerDay;

        if (daysLate > 10)
            fine += 100;

        System.out.println(bookName);
        System.out.println("Fine = " + fine);
    }
}

public class Main {
    public static void main(String[] args) {
        Library l = new Library();
        l.setData("Java", 12, 10);
        l.display();
    }
}