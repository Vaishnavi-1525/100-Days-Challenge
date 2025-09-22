public class day33 
{
    public static void main(String args[]) 
    {
        // Outer loop → controls the number of rows (1 to 5)
        for (int i = 1; i <= 5; i++) 
        {
            // First inner loop → prints spaces before stars
            // Number of spaces decreases as row number increases
            for (int k = 1; k <= 5 - i; k++) 
            {
                System.out.print(" ");
            }

            // Second inner loop → prints stars
            // Number of stars increases with each row
            for (int j = 1; j <= i; j++) 
            {
                System.out.print("* ");
            }

            // Move to next line after printing each row
            System.out.println();
        }
    }
}
