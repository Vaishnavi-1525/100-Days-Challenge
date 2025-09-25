import java.util.*;

public class day39
{
    public static void main(String args[])
    {
        // Outer loop: controls the row number (1 to 5)
        for(int i = 1; i <= 5; i++)
        {
            // Inner loop: prints the current value of i five times in one row
            for(int k = 1; k <= 5; k++)
            {
                System.out.print(i + " "); // prints i followed by a space
            }
            
            // Moves to the next line after inner loop finishes
            System.out.println("  ");
        }
    }
}
