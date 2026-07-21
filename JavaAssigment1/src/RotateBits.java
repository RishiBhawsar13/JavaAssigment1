public class RotateBits {
    public static void main(String[] args) {
        int n = 8;

        int left = Integer.rotateLeft(n, 1);
        int right = Integer.rotateRight(n, 1);

        System.out.println("Original = " + n);
        System.out.println("Left Rotate = " + left);
        System.out.println("Right Rotate = " + right);
    }
}