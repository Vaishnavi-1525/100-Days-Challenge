import java.util.Scanner;

public class day20 
{  
    // Method to check if number is prime
    public static boolean isPrime(int num)
    {
        if(num < 2)
        {
            return false; // numbers less than 2 are not prime
        }
        
        // check divisors up to sqrt(num)
        for(int i = 2; i <= Math.sqrt(num); i++)
        {
            if(num % i == 0)
            {
                return false; // found a divisor, not prime
            }
        }
        
        return true; // no divisors found, it's prime
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Input value
        System.out.println("Enter the Number:");
        int num = sc.nextInt();

        // Check prime
        if(isPrime(num))
        {
            System.out.println(num + " is a Prime Number"); 
        }
        else
        {
            System.out.println(num + " is Not a Prime Number"); 
        }

        sc.close(); // close scanner
    }
}
