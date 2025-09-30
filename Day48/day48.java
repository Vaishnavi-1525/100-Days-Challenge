import java.util.*; 

public class day48
{
    public static void main(String[] args) 
    {
        // Create Scanner object for taking input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");

        // Read the full input string (including spaces if any)
        String str = sc.nextLine();

        // Create a StringBuilder to build the final result string
        StringBuilder result = new StringBuilder();

        // Loop through each character in the input string
        for (int i = 0; i < str.length(); i++) 
        {
            // Get the current character
            char ch = str.charAt(i);

            // Check if the character is a vowel (both lowercase and uppercase)
            if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ||
                (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) 
            {
                // Skip adding the vowel to the result
                continue;
            } 
