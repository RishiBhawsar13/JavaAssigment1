class CourseStudent {
    private String studentName, courseName;
    private double courseFee, discountPercent;

    public void setData(String s, String c, double fee, double dis) {
        studentName = s;
        courseName = c;
        courseFee = fee;
        discountPercent = dis;
    }

    public void display() {
        double finalFee = courseFee - (courseFee * discountPercent / 100);
        System.out.println("Student: " + studentName);
        System.out.println("Course: " + courseName);
        System.out.println("Final Fee: " + finalFee);
    }
}

public class Main {
    public static void main(String[] args) {
        CourseStudent obj = new CourseStudent();
        obj.setData("Rishi", "Java", 10000, 20);
        obj.display();
    }
}