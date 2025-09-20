public class day29 
{
    public static void main(String args[]) 
  {
        
        // Outer loop → controls rows (5 rows)
        for (int i = 1; i <= 5; i++) 
        {
            
            // Inner loop → controls columns (5 columns)
            for (int j = 1; j <= 5; j++) 
            {
                
                // Print * at the border positions
                if (i == 1 || i == 5 || j == 1 || j == 5) 
                {
                    System.out.print(" * ");
                } 
                // Otherwise print spaces
                else {
                    System.out.print("   ");
                }
            }
            
            // Move to next line after finishing a row
            System.out.println("\n");
        }
    }
}
