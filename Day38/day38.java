import java.util.*;

public class day38
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

            // Print numbers in increasing order (1 to 2*i - 1)
            for (int j = 1; j <= 2 * i - 1; j++)
            {
                System.out.print(j + " ");
            }

            // Move to the next line
            System.out.println("  ");
        }
    }
}
