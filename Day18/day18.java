import java.util.Scanner;

public class day18
{
	public static int gcd(int a,int b)
	{
		while(b!=0)
		{
		    int temp=b;
		    b=a%b;
		    a=temp;
		}
		return a;
	}
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        // Input value
        System.out.println("Enter the Numerator of First Fraction");
        int num1 = sc.nextInt();
		System.out.println("Enter the Numerator of Second Fraction");
		int num2 = sc.nextInt();
		System.out.println("Enter the Denominator of First Fraction");
        int dem1 = sc.nextInt();
		System.out.println("Enter the Denominator of Second Fraction");
		int dem2 = sc.nextInt();
		
		if( dem1==0 &dem2==0 )
		{
			System.out.print("Denominator cannot be zero. ");
			sc.close();
			return;
		}
		
		int numresult=(num1*dem2)+(num2*dem1);
		int demresult=dem1*dem2;
		
		int commondivisor=gcd(numresult,demresult);
		numresult/=commondivisor;
		demresult/=commondivisor;

        System.out.println("Sum of the fractions: " + numresult + " / " + demresult);
        sc.close(); // close scanner
    }
}
