import java.util.*;
public class day4
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number");
		int ch=s.nextInt(); 
		
		 // Check if it is Positive Number 
		if( ch > 0 )
		{
			System.out.println(ch + " is an Positive Number");
		} 
		// If the input is Neither Positive nor Negative Number
		else if(ch == 0)
        {
            System.out.println(ch + " Neither positive nor negative");
        }
		 // If the input is a Negative Number
		else
		{
			System.out.println(ch + " is an Negative Number");
		}
		s.close();
	}
}
