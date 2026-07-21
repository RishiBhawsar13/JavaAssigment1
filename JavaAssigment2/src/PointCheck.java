public class PointCheck {
    public static void main(String[] args) {

        int x = 0;
        int y = 5;

        if (x == 0 && y == 0)
            System.out.println("Origin");
        else if (x == 0)
            System.out.println("Y-axis");
        else if (y == 0)
            System.out.println("X-axis");
        else
            System.out.println("Neither Axis");
    }
}