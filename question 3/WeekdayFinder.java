import java.util.Scanner;

public class WeekdayFinder {
    public static void main(String[] args) {
        // Array of weekdays starting from Sunday (index 0)
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day index (0-6): ");

        try {
            int index = sc.nextInt();
            // This will throw ArrayIndexOutOfBoundsException if index is not in 0–6
            System.out.println("Day is: " + weekdays[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index! Please enter a number between 0 and 6.");
        }

        sc.close();
    }
}
