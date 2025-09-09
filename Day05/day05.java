import java.util.*;
public class day05
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number");
		int ch=s.nextInt(); 
		
		 // Check if it is Even Number 
		if( ch %2==0 )
		{
			System.out.println(ch + " is an Even Number");
		}
		 // If the input is a Odd Number
		else
		{
			System.out.println(ch + " is an Odd Number");
		}
		s.close();
	}
}
