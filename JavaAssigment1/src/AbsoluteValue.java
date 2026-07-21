public class AbsoluteValue {
    public static void main(String[] args) {
        int n = -25;

        int abs = (n < 0) ? -n : n;

        System.out.println("Absolute Value = " + abs);
    }
}