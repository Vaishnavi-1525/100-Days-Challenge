import java.util.*;

public class day02   
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a Character");
        char ch = s.next().charAt(0); 
        
        // Check if the character is an alphabet (either uppercase or lowercase)
        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
        {
            System.out.println(ch + " is an Alphabet");
        } 
        // If the input is not an alphabet (like number, symbol, etc.)
        else
        {
            System.out.println(ch + " is Not an Alphabet");
        }

        s.close(); // Closing Scanner object to avoid memory leak
    }
}
