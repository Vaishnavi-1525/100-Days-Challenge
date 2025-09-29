import java.util.*; 

public class day46
  {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Input a string from user
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int count = 0; // Variable to store length

        // Infinite loop (will break when index goes out of bounds)
        while (true) {
            try {
                // Try to access character at current index
                str.charAt(count);

                // If successful, increment count
                count++;
            } catch (StringIndexOutOfBoundsException e) {
                // When index >= length, exception occurs → break the loop
                break;
            }
        }

        // Print final length
        System.out.println("Length of the string is: " + count);

        // Close Scanner
        sc.close();
    }
}
