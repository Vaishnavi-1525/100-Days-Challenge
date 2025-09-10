import java.util.Scanner;

public class day13 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input limit (N)
        System.out.println("Enter the Limit:");
        int limit = sc.nextInt();

        int sum = 0; // Variable to store sum

        // Loop from 1 to N
        for(int i = 1; i <= limit; i++) {
            sum += i; // Add i to sum
        }

        // Print final result
        System.out.println("Sum of numbers from 1 to " + limit + " is: " + sum);

        sc.close(); // close scanner
    }
}
