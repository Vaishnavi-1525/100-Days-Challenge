import java.util.Scanner;

public class day15 
{
    // Function to calculate factorial of a digit
    public static int factorial(int num) 
    {
        int result = 1;
        for (int i = 1; i <= num; i++) 
        {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) 
    {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input value
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        // Copy of original number to compare later
        int copy = num;

        // Variable to store sum of factorial of digits
        int result = 0;

        // Extract each digit and calculate factorial
        while (num > 0) 
        {
            int rem = num % 10;              // get last digit
            result += factorial(rem);        // add factorial of digit to result
            num = num / 10;                  // remove last digit
        }

        // Check if number is Strong or not
        if (result == copy) 
        {
            System.out.println(copy + " is a Strong Number");
        } 
        else 
        {
            System.out.println(copy + " is Not a Strong Number");
        }

        // Close scanner
        sc.close();
    }
}
