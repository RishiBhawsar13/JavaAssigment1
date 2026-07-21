public class PositiveNegativeZero {
    public static void main(String[] args) {
        int n = -8;

        String result = (n > 0) ? "Positive"
                : (n < 0) ? "Negative"
                : "Zero";

        System.out.println(result);
    }
}