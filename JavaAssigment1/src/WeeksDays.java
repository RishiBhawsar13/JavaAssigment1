public class WeeksDays {
    public static void main(String[] args) {
        int days = 25;

        int weeks = days / 7;
        int remaining = days % 7;

        System.out.println("Weeks = " + weeks);
        System.out.println("Remaining Days = " + remaining);
    }
}