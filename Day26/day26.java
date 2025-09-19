import java.util.*;  
public class day26  
{  
    public static void main(String args[])  
    {  
        // Outer loop → Controls the number of rows (5 rows in total)  
        for(int i = 1; i <= 5; i++)  
        {  
            // First inner loop → Prints leading spaces before stars  
            // For each row, spaces decrease as stars increase  
            for(int k = 1; k <= 6 - i; k++)  
            {  
                System.out.print("  ");  // Two spaces for alignment  
            }  
            
            // Second inner loop → Prints stars in each row  
            for(int j = 1; j <= i; j++)  
            {  
                System.out.print("* ");  // Print star followed by space  
            }  
            
            // Move to the next line after printing one row  
            System.out.println("  ");  
        }  
    }  
}  
