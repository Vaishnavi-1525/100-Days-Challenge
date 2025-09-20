import java.util.*;

public class day28 
{
    public static void main(String args[]) 
  {
        
        // Outer loop controls the number of rows (5 rows)
        for (int i = 1; i <= 5; i++) 
        {
            
            // Inner loop controls the number of columns (5 stars in each row)
            for (int k = 1; k <= 5; k++) 
            {
                // Print a star followed by two spaces, but stay on the same line
                System.out.print("*  ");
            }
            
            // After finishing one row, move the cursor to the next line
            System.out.println();
        }
    }
}
