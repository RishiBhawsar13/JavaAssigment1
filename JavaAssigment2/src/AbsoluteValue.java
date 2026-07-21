public class AbsoluteValue {
    public static void main(String[] args) {
        int n = -25;

        if (n < 0)
            n = -n;

        System.out.println("Absolute Value = " + n);
    }
}