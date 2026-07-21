public class ToggleBit {
    public static void main(String[] args) {
        int n = 10;

        int result = n ^ (1 << 2);

        System.out.println("Original = " + n);
        System.out.println("After Toggling 3rd Bit = " + result);
    }
}