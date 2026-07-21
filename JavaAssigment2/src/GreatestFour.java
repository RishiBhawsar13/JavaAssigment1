public class GreatestFour {
    public static void main(String[] args) {
        int a = 10, b = 45, c = 25, d = 30;

        int max;

        if (a > b) {
            if (a > c) {
                if (a > d)
                    max = a;
                else
                    max = d;
            } else {
                if (c > d)
                    max = c;
                else
                    max = d;
            }
        } else {
            if (b > c) {
                if (b > d)
                    max = b;
                else
                    max = d;
            } else {
                if (c > d)
                    max = c;
                else
                    max = d;
            }
        }

        System.out.println("Greatest = " + max);
    }
}