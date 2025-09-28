
import java.util.*;

public class day44
{
    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in); // Scanner object for input

        // Prompt user to enter a string
        System.out.println("Enter the String");
        String string = sc.nextLine();  // Read full line input

        String reverse = ""; // Empty string to store the reversed value

        // Loop runs from last character (length - 1) down to first (0)
        for (int i = string.length() - 1; i >= 0; i--)
        {
            reverse += string.charAt(i); // Append each character in reverse order
        }

        // Print the reversed string
        System.out.print("Reversed String: " + reverse);

        sc.close(); // Close scanner to free resources
    }
}
