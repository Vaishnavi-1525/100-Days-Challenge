
import java.util.*;

public class day03 
{
    public static void main(String[] args) 
  {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Character: ");
        char ch = s.next().charAt(0);   // take first character of input
        int ascii = ch;                 // implicit conversion char → int
        System.out.println("The ASCII value of '" + ch + "' is: " + ascii);
        s.close();
    }
}
