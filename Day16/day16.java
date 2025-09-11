import java.util.Scanner;

public class day16 
{
    public static void main(String[] args) 
    {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input value
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        // Copy original number for comparison
        int copy = num;

        // Variable to store sum of divisors
        int sum = 0;

        // Loop to find all proper divisors (excluding the number itself)
        for (int i = 1; i < num; i++) 
        {
            if (num % i == 0)  // if i divides num completely
            {
                sum += i;      // add divisor to sum
            }
        }

        // Check if number is Perfect or Not
        if (sum == copy) 
        {
            System.out.println(copy + " is a Perfect Number");
        } 
        else 
        {
            System.out.println(copy + " is Not a Perfect Number");
        }

        // Close scanner
        sc.close();
    }
}
