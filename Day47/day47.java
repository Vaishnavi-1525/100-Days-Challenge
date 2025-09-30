import java.util.*;

public class day47 
{
    public static void main(String[] args) 
    {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");

        // Read the entire line of input (including spaces)
        String str = sc.nextLine();

        // Create a StringBuilder object to build the final result
        StringBuilder result = new StringBuilder();

        // Loop through each character in the input string
        for (int i = 0; i < str.length(); i++) 
        {
            // Get the current character
            char ch = str.charAt(i);

            // Check if the character is uppercase
            if (Character.isUpperCase(ch)) 
            {
                // If uppercase, convert to lowercase and append to result
                result.append(Character.toLowerCase(ch));
            } 
            else 
            {
                // If not uppercase (either lowercase or other character), convert to uppercase and append
                result.append(Character.toUpperCase(ch));
            }
        }

        // Print the final string with toggled cases
        System.out.println("Toggled string: " + result);

        // Close the scanner to free up resources
        sc.close();
    }
}
