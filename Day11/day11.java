import java.util.Scanner;

public class Day11 
{

    public static void main(String[] args) 
  {
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Ask user for number of terms
        System.out.print("Enter the Limit: ");
        int limit = sc.nextInt();

        // Initialize first two Fibonacci numbers
        int x = 1, y = 1, z;
        int i = 1; // counter

        // Print Fibonacci series using do-while loop
        do {
            System.out.println(x);
            z = x + y; // next term
            x = y;     // shift values
            y = z;
            i++;
        } while (i <= limit);

        // Close Scanner
        sc.close();
    }
}
