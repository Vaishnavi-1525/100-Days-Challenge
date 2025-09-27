import java.util.Scanner; 

public class day43
{
    public static void main(String[] args) 
    {
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter the Number");
        int num = sc.nextInt(); // Read integer input from user

        /*
           Using Bitwise Left Shift Operator (<<):
           num << 1 means shifting all bits of 'num' one place to the left.
           This is equivalent to multiplying the number by 2.
           
           Example:
           If num = 5 (binary 0101)
           num << 1 = 10 (binary 1010)
        */
        System.out.print("Result after left shift (num * 2): " + (num << 1));

        // Close Scanner to prevent resource leak
        sc.close(); 
    }
}
