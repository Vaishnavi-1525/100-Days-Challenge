import java.util.Scanner;

public class day12 
{
    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);

        // Input number from user
        System.out.println("Enter the Number:");
        int num = sc.nextInt();

        // If number is negative, make it positive using Math.abs()
        num = Math.abs(num);

        int sum = 0; // Variable to store sum of digits

        // Loop until number becomes 0
        while(num > 0) {
            // Extract last digit using modulus operator
            int digit = num % 10;

            // Add digit to sum
            sum += digit;

            // Remove last digit by dividing number by 10
            num = num / 10;
        }

        // Print final result
        System.out.println("Sum of Digits = " + sum);

        sc.close();
    }
}
