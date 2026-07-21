public class LeapYearTernary {
    public static void main(String[] args) {
        int year = 2024;

        String result = ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
                ? "Leap Year"
                : "Not Leap Year";

        System.out.println(result);
    }
}