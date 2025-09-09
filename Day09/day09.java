import java.util.Scanner;

public class day09 
{
    public static void main(String[] args)
  {
        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask user for a number
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        // Temporary variable to process number
        int temp = num;

        // Counter variable to count digits
        int count = 0;

        // Special case: if number is 0, it has 1 digit
        if (temp == 0) {
            count = 1;
        } else {
            // Loop until number becomes 0
            while (temp > 0) {
                temp = temp / 10;  // Remove last digit
                count++;           // Increase digit count
            }
        }

        // Print result
        System.out.println("Number of Digits: " + count);

        // Close scanner (good practice)
        sc.close();
    }
}
