// Program: Number Pyramid (Right-Aligned)
// Day 35
public class day35 
{
    public static void main(String args[]) 
    {
        // Outer loop controls the number of rows (1 to 5)
        for (int i = 1; i <= 5; i++) 
        {
            // Inner loop 1: Print spaces before numbers
            // Number of spaces = (5 - i), so the numbers are right-aligned
            for (int k = 1; k <= 5 - i; k++) 
            {
                System.out.print(" ");
            }

            // Inner loop 2: Print the number 'i' repeated 'i' times
            // Example: Row 3 → "3 3 3"
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(i + " ");
            }

            // Move to the next line after completing one row
            System.out.println();
        }
    }
}
