import java.util.Scanner;

public class day14 
{
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Input value
        System.out.println("Enter the Number:");
        int num = sc.nextInt();

        // Keep a copy of the original number
        int original = num;

        // Work with positive part only
        num = Math.abs(num);

        int result = 0; // Variable to store reversed number

        // Loop until number becomes 0
        while(num > 0) {
            int digit = num % 10;             // Extract last digit
            result = (result * 10) + digit;   // Add digit to reversed number
            num = num / 10;                   // Remove last digit
        }

        // If original number was negative, make result negative
        if(original < 0) {
            result = -result;
        }

        // Print the reversed number
        System.out.println("Reversed Number = " + result);

        // Close scanner
        sc.close();
    }
}
