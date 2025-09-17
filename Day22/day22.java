import java.util.Scanner;

public class day22
{  
    // Function to check if a number is prime
    public static boolean isprime(int num)
    {
        // Numbers less than 2 are not prime
        if(num < 2)
        {
            return false;
        }
        else
        {
            // Check divisibility from 2 up to num/2
            for(int i = 2; i <= num / 2; i++)
            {
                if(num % i == 0) // if divisible, not prime
                {
                    return false;
                }
            }
            // If no divisor found, number is prime
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter the Number");
        int num = sc.nextInt();

        // Flag to check if the number can be expressed as sum of two primes
        int flag = 0;
        
        // Loop from 2 to num/2
        for(int i = 2; i <= num/2; i++)
        {
            // Check if i and (num - i) are both prime
            if(isprime(i) && isprime(num - i))
            {
                System.out.println(num + " can be expressed as the sum of " + i + " and " + (num - i));
                flag = 1; // mark that at least one representation is found
            }
        }
        
        // If no such pair found, print message
        if(flag == 0)
        {
            System.out.println(num + " cannot be expressed as the sum of two primes ");   
        }
        
        sc.close(); // close scanner
    }
}
