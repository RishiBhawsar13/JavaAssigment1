public class PerfectSquare {
    public static void main(String[] args) {

        int n = 49;

        int root = (int) Math.sqrt(n);

        if (root * root == n)
            System.out.println("Perfect Square");
        else
            System.out.println("Not Perfect Square");
    }
}