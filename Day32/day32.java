import java.util.*;

public class day32
{
    public static void main(String args[])
    {
        // Loop through rows (1 to 10)
        for (int i = 1; i <= 10; i++)
        {
            // Loop through columns (1 to 10)
            for (int j = 1; j <= 10; j++)
            {
                // Print star for borders (first row, last row, first column, last column)
                if (j == 1 || j == 10 || i == 1 || i == 10)
                {
                    System.out.print("* ");
                }
                // Print star for main diagonal (where row == column)
                else if (i == j)
                {
                    System.out.print("* ");
                }
                // Otherwise print spaces
                else
                {
                    System.out.print("  ");
                }
            }
            // Move to next line after finishing one row
            System.out.println("\n");
        }
    }
}
