class Employee {
    private String name;
    private double salary;
    private int years;

    public void setData(String n, double s, int y) {
        name = n;
        salary = s;
        years = y;
    }

    public void display() {
        double bonus;

        if (years >= 10)
            bonus = salary * 0.20;
        else if (years >= 5)
            bonus = salary * 0.10;
        else
            bonus = salary * 0.05;

        System.out.println("Final Salary = " + (salary + bonus));
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setData("Rishi", 50000, 6);
        e.display();
    }
}