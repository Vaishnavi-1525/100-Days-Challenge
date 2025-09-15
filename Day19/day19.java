import java.util.Scanner;

public class day19
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Input value
        System.out.println("Enter the Number");
        int num = sc.nextInt();

        int copy = num;   // store original number
        int sum = 0;      // to store sum of divisors

        // Find divisors of the number (excluding itself)
        int i = 1;
        while(i <= num / 2)   // only go till half of the number
        {
            if(num % i == 0)  // if i divides num perfectly
            {
                sum += i;     // add divisor to sum
            }
            i++;
        }

        // Check if the number is Perfect
        if(sum == copy)
        {
            System.out.print(copy + " is a Perfect Number");
        }
        else
        {
            System.out.print(copy + " is Not a Perfect Number");
        }

        sc.close(); // close scanner
    }
}
