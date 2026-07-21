public class AreaSwitch {
    public static void main(String[] args) {

        int choice = 1;

        switch (choice) {

            case 1:
                double r = 5;
                System.out.println("Area = " + Math.PI * r * r);
                break;

            case 2:
                int side = 4;
                System.out.println("Area = " + side * side);
                break;

            case 3:
                int l = 6, w = 3;
                System.out.println("Area = " + l * w);
                break;

            case 4:
                int b = 8, h = 5;
                System.out.println("Area = " + (0.5 * b * h));
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}