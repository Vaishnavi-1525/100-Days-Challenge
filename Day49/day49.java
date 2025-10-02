import java.util.*;  

public class day49  
{  
    public static void main(String[] args)   
    {  
        Scanner sc = new Scanner(System.in);   

        System.out.println("Enter a string:");  
        String str = sc.nextLine();   // Read the input string  
        String copy = str;            // Keep a copy of original string for comparison  
        StringBuilder result = new StringBuilder(); // To store the reversed string  

        // Loop to traverse string characters from end to start
        for (int i = str.length() - 1; i >= 0; i--)   
        {  
            char ch = str.charAt(i);   // Get character at position i  
            result.append(ch);         // Append the character to result (reversing string)  
        }  

        // Compare original string with reversed string  
        if (copy.equals(result.toString()))  
        {  
            System.out.println("Palindrome string ");  // If both are same → Palindrome  
        }  
        else  
        {  
            System.out.println("Not Palindrome string "); // Otherwise → Not Palindrome  
        }  

        sc.close();  // Close Scanner object to prevent resource leak  
    }  
}
