import java.util.*; 

public class day40   
{
    public static void main(String args[])
    {
        // Outer loop: runs 5 times (for each row)
        for(int i = 1; i <= 5; i++)
        {
            // Inner loop: prints numbers 1 to 5 in each row
            for(int k = 1; k <= 5; k++)
            {
                System.out.print(k + " ");   // Print number followed by a space
            }
            
            System.out.println("  ");  // Move to next line after printing one row
        }
    }
}
