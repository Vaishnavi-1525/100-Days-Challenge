import java.util.*;
public class day2
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Character");
		char ch=s.next().charAt(0); 
		
		 // Check if it is character 
		if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z') )
		{
			System.out.println(ch + " is an Alphabet");
		} 
		 // If the input is not a letter
		else
		{
			System.out.println(ch + " is Not an Alphabet");
		}
		s.close();
	}
}
