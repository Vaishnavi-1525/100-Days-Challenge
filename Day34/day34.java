import java.util.*;

public class day34
{
    public static void main(String args[])
    {
        // Outer loop → controls the number of rows (1 to 5)
        for(int i = 1; i <= 5; i++)
        {
            // First inner loop → prints spaces before the stars
            // Each row needs (5 - i) spaces for proper alignment
            for(int k = 1; k <= 5 - i; k++)
            {
                System.out.print("  "); // double space for symmetry
            }

            // Second inner loop → prints stars
            // Formula (2 * i - 1) ensures odd number of stars in each row
            for(int j = 1; j <= 2 * i - 1; j++)
            {
                System.out.print("* ");
            }

            // Move to next line after each row
            System.out.println("  ");
        }
    }
}
