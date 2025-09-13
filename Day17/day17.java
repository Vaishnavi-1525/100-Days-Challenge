import java.util.Scanner;

public class day17 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();   // Number whose factors we want
        int i = 1;                // Counter variable starting from 1

        System.out.println("Factors of " + num + " are: ");

        // Loop runs from 1 to num
        while (i <= num) {
            // If num is divisible by i, then i is a factor
            if (num % i == 0) {
                System.out.print(i + "  ");
            }
            i++; // Increment counter
        }

        sc.close(); // Closing scanner to avoid resource leak
    }
}
