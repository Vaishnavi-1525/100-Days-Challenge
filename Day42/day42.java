import java.util.Scanner; 

public class day42
{
    public static void main(String[] args) 
    {
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter number of persons
        System.out.println("Enter the Number of Person's");
        int persons = sc.nextInt(); // Read integer input

        /* 
           Formula for total number of handshakes:
           Each person shakes hands with every other person once.
           So, total handshakes = n * (n-1) / 2
        */
        int handshake = (persons * (persons - 1)) / 2;

        // Display the result
        System.out.print("Total handshakes possible: " + handshake);

        // Close the Scanner object to prevent resource leak
        sc.close(); 
    }
}
