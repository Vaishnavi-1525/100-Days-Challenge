
public class day36 
{
    public static void main(String args[]) 
    {
        // Outer loop for rows
        for (int i = 1; i <= 5; i++) 
        {
            // Print spaces for right alignment
            for (int k = 1; k <= 5 - i; k++) 
            {
                System.out.print(" ");
            }

            // Print numbers from 1 to i
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(j + " ");
            }

            // Move to next line after each row
            System.out.println();
        }
    }
}
