import java.util.Scanner;  

public class day54
{
    public static void main(String[] args)
  {
        Scanner sc = new Scanner(System.in);   // Create Scanner object

        // Ask user to enter a string
        System.out.println("Enter a String");
        String str = sc.nextLine();   // Read the full line from user

        System.out.println("Non-repeating characters are:");

        // Loop through each character of the string
        for (int i = 0; i < str.length(); i++) 
        {
            char ch = str.charAt(i);  // Get character at position i

            // Skip spaces if present
            if (ch == ' ') {
                continue;
            }

            // Check if the character occurs only once in the string
            // indexOf(ch) gives first position, lastIndexOf(ch) gives last position
            if (str.indexOf(ch) == str.lastIndexOf(ch)) 
            {
                System.out.print(ch + " ");   // Print if non-repeating
            }
        }

        sc.close();   // Close the Scanner
    }
}
