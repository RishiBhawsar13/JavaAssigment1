class BankAccount {
    private String accountHolder;
    private double balance, withdrawAmount;

    public void setData(String n, double b, double w) {
        accountHolder = n;
        balance = b;
        withdrawAmount = w;
    }

    public void display() {
        if (withdrawAmount <= balance)
            balance -= withdrawAmount;
        else
            System.out.println("Insufficient Balance");

        System.out.println("Remaining Balance = " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setData("Rishi", 20000, 5000);
        b.display();
    }
}