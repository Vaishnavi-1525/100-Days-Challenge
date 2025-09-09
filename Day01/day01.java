import java.util.*;
public class Day01
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Character");
        char ch = s.next().charAt(0); 
        
        // Check if the character is a vowel
        if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || 
           ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            System.out.println("The Given Character is a Vowel");
        } 
        // Check if the character is a consonant (letter but not a vowel)
        else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
        {
            System.out.println("The Given Character is a Consonant");
        }
        // If the input is not a letter
        else
        {
            System.out.println("Invalid Choice");
        }
        s.close();
    }
}
