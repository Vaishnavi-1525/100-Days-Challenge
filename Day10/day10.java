import java.util.Scanner;

public class Day10
  {

    public static void main(String[] args)
    {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        // Initialize result to 1 (factorial base case)
        int result = 1;

        // Calculate factorial using a for loop
        for (int i = 1; i <= num; i++) {
            result *= i;  // result = result * i
        }

        // Print the result
        System.out.println("Factorial of " + num + " is " + result);

        // Close scanner (good practice)
        sc.close();
    }
}
