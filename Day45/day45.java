import java.util.*; 

public class day45
{
    public static void main(String[] args) 
    {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the first string
        System.out.println("Enter the First String");
        String string1 = sc.nextLine(); // Read first string input

        // Ask the user to enter the second string
        System.out.println("Enter the Second String which you want to join");
        String string2 = sc.nextLine(); // Read second string input

        // Variable to store the joined string
        String Joinstring = "";

        // Concatenate string1 and string2 using '+' operator
        Joinstring = string1 + string2;

        // Print the final joined string
        System.out.print("The joined string is: " + Joinstring); 

        // Close the Scanner to avoid resource leakage
        sc.close(); 
    }
}
