class StudentResult {
    private String name;
    private int math, science, english;

    public void setData(String n, int m, int s, int e) {
        name = n;
        math = m;
        science = s;
        english = e;
    }

    public void display() {
        int total = math + science + english;
        double avg = total / 3.0;

        System.out.println("Total = " + total);
        System.out.println("Average = " + avg);

        if (avg >= 90)
            System.out.println("Grade A");
        else if (avg >= 75)
            System.out.println("Grade B");
        else if (avg >= 50)
            System.out.println("Grade C");
        else
            System.out.println("Fail");
    }
}

public class Main {
    public static void main(String[] args) {
        StudentResult s = new StudentResult();
        s.setData("Rishi", 90, 80, 85);
        s.display();
    }
}