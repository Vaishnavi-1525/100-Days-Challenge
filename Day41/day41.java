import java.util.Scanner;  

public class day41 
{
    public static void main(String[] args) 
  {
        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Prompt user for radius
        System.out.println("Enter the Radius of Circle");
        int radius = sc.nextInt();  // Read radius as integer

        // Formula: Area = π * r^2
        // Using 3.14 as an approximation of π
        double area = 3.14 * (radius * radius);

        // Print the result
        System.out.print("Area of Circle: " + area);

        // Close scanner to avoid resource leaks
        sc.close();
    }
}
