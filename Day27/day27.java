import java.util.*;  
public class day27  
{  
    public static void main(String args[])  
    {  
        // Outer loop → Controls the number of rows (5 rows total)  
        for(int i = 1; i <= 5; i++)  
        {  
            // First inner loop → Prints leading spaces for alignment  
            // Spaces increase with each row  
            for(int k = 1; k <= i; k++)  
            {  
                System.out.print("  ");  // Two spaces  
            }  
            
            // Second inner loop → Prints stars in decreasing order  
            // Number of stars in row = (6 - i)  
            for(int j = 1; j <= 6 - i; j++)  
            {  
                System.out.print("* ");  // Star followed by space  
            }  
            
            // After printing spaces + stars, move to next line  
            System.out.println("  ");  
        }  
    }  
}  
