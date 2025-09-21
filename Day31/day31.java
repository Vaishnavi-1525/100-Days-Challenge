import java.util.*;

public class day31
{
    public static void main(String args[])
    {
        // Outer loop controls the number of rows (1 to 5)
        for (int i = 1; i <= 5; i++)
        {
            // Inner loop prints numbers from 1 up to current row number (i)
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");  // Print the number with space
            }

            // Move to the next line after each row is printed
            System.out.println("  ");
        }
    }
}
