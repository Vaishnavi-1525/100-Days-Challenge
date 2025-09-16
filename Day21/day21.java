import java.util.Scanner;

public class day21
{  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input from the user
        System.out.println("Enter the Number:");
        int num = sc.nextInt();

        // Step 2: Store the original number in a copy variable
        int copy = num;

        // Step 3: Initialize variable to store reversed number
        int result = 0;

        // Step 4: Reverse the number using remainder and division
        while(num > 0)
        {
            int rem = num % 10;       // Get last digit
            result = (result * 10) + rem; // Append digit to reversed number
            num = num / 10;           // Remove last digit
        }

        // Step 5: Check if the original number equals the reversed number
        if(result == copy)
        {
            System.out.print(copy + " is a Palindrome Number"); 
        }
        else
        {
            System.out.print(copy + " is NOT a Palindrome Number"); 
        }

        sc.close(); // Close scanner to avoid memory leak
    }
}
