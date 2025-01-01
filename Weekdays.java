import java.util.Scanner;

public class Weekdays {

    public static void main(String[] args) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day position (0-6): ");

        try {
            int dayPosition = scanner.nextInt();

            // Check if dayPosition is within the valid range (0-6)
            if (dayPosition < 0 || dayPosition > 6) {
                throw new ArrayIndexOutOfBoundsException("Day position should be between 0 and 6.");
            }

            String dayName = daysOfWeek[dayPosition];
            System.out.println("Day name: " + dayName);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}