public class day30 
{
    public static void main(String args[]) 
  {
        
        // Outer loop → controls number of rows (5 rows total)
        for (int i = 1; i <= 5; i++) 
        {
            
            // Inner loop → controls how many times the number is printed in each row
            for (int j = 1; j <= i; j++) 
            {
                // Print the current row number followed by a space
                System.out.print(i + " ");
            }
            
            // After printing one row, move to the next line
            System.out.println("  ");
        }
    }
}
