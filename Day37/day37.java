import java.util.*;

public class day37
{
    public static void main(String args[])
    {
        // Outer loop for number of rows (1 to 5)
        for (int i = 1; i <= 5; i++)
        {
            // Print spaces before numbers (for pyramid alignment)
            for (int k = 1; k <= 5 - i; k++)
            {
                System.out.print("  ");
            }

            // Print numbers (row number repeated in pyramid shape)
            for (int j = 1; j <= 2 * i - 1; j++)
            {
                System.out.print(i + " ");
            }

            // Move to the next line
            System.out.println("  ");
        }
    }
}
