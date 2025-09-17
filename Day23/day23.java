import java.util.Scanner;

public class day23
  {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input number from the user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;  // store original value (optional, useful if you want to check palindrome later)
        int reversed = 0;    // this will hold the reversed number

        // Loop until all digits are processed
        while (num > 0) 
        {
            int rem = num % 10;          // extract the last digit
            reversed = reversed * 10 + rem; // build the reversed number
            num = num / 10;              // remove the last digit from num
        }

        // Print the reversed number
        System.out.println("Reversed Number: " + reversed);

        sc.close(); // close scanner to avoid memory leaks
    }
}
