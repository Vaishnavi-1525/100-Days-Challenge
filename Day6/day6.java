import java.util.*;
public class day6
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a X Co-ordinate");
		int x=s.nextInt();
        System.out.println("Enter a Y Co-ordinate");
		int y=s.nextInt();		
		
		 // Check if co-ordinate lies in the I Quadrant 
		if( x > 0 && y > 0 )
		{
			System.out.println("This point lies in First quadrant.");
		} 
		// if co-ordinate lies in the II Quadrant 
		else if( x < 0 && y > 0 )
        {
            System.out.println("This point lies in Second quadrant.");
        }
		 // if co-ordinate lies in the III Quadrant 
		else if( x < 0 && y < 0)
        {
            System.out.println("This point lies in Third quadrant.");
        }
		// if co-ordinate lies in the IV Quadrant 
		else if( x > 0 && y < 0)
		{
			System.out.println("This point lies in Fourth quadrant.");
		}
		// if co-ordinate lies in the X and Y axes 
		else if (x == 0 && y == 0) 
		{
            System.out.println("This point lies at the Origin.");
        }
		// if co-ordinate lies in the X axes
		else if (x == 0) 
		{
            System.out.println("This point lies on the Y-axis.");
        } 
		// if co-ordinate lies in the Y axes
		else if (y == 0) 
		{
            System.out.println("This point lies on the X-axis.");
		}
		s.close();
	}
}
