import java.util.*;

public class day25 
{
    public static void main(String args[])
    {
        
        // Outer loop → controls the number of rows (total 5 rows)
        for (int i = 1; i <= 5; i++) {
            
            // Inner loop → prints stars in decreasing order
            // For row 1 → 5 stars, row 2 → 4 stars, row 3 → 3 stars, etc.
            for (int k = 1; k <= 6 - i; k++) {
                System.out.print("* "); // Print a star followed by space
            }
            
            // After printing one full row of stars, move to the next line
            System.out.println("  ");
        }
    }
}
