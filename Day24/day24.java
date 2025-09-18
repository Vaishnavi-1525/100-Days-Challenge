import java.util.*;

public class day24 
{
    public static void main(String args[]) 
  {
        
        // Outer loop: Controls the number of rows (i = row number)
        for (int i = 1; i <= 5; i++) {
            
            // Inner loop: Prints stars in each row
            // For each row 'i', it prints 'i' stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // Printing a star with a space
            }
            
            // After finishing one row of stars, move to the next line
            System.out.println("  ");
        }
    }
}
