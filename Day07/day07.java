import java.util.*;

public class day07 
{
    public static void main(String args[])
  {
        Scanner s = new Scanner(System.in);

        // Input year
        System.out.println("Enter a Year");
        int year = s.nextInt();

        // Input month number (1–12)
        System.out.println("Enter a Month");
        int month = s.nextInt();

        // Case 1: If month is February (2)
        if (month == 2) {
            // Leap year check:
            // Rule: divisible by 400 OR divisible by 4 but not 100
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println("Number of days is 29.");
            } else {
                System.out.println("Number of days is 28.");
            }
        }
        // Case 2: Months with 31 days
        else if (month == 1 || month == 3 || month == 5 || month == 7 || 
                 month == 8 || month == 10 || month == 12) {
            System.out.println("Number of days is 31.");
        }
        // Case 3: Remaining months → 30 days
        else {
            System.out.println("Number of days is 30.");
        }

        s.close(); // close Scanner to avoid resource leak
    }
}
