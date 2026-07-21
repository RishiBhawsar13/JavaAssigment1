public class Median {
    public static void main(String[] args) {
        int a = 20, b = 15, c = 25;

        int median = (a > b)
                ? ((a < c) ? a : (b > c ? b : c))
                : ((b < c) ? b : (a > c ? a : c));

        System.out.println("Median = " + median);
    }
}