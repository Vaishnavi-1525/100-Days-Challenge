import java.util.Scanner;

public class Day8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values of a, b, c
        System.out.println("Enter the Value of A, B, C :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Calculate discriminant: d = b^2 - 4ac
        int d = (b * b) - (4 * a * c);

        // Case 1: If discriminant > 0 → Two distinct real roots
        if (d > 0) {
            double root1 = (-b + Math.sqrt(d)) / (2.0 * a);
            double root2 = (-b - Math.sqrt(d)) / (2.0 * a);
            System.out.println("Root 1 : " + root1);
            System.out.println("Root 2 : " + root2);
        } 
        // Case 2: If discriminant == 0 → One real root
        else if (d == 0) {
            double root = -b / (2.0 * a);
            System.out.println("Root : " + root);
        } 
        // Case 3: If discriminant < 0 → Imaginary roots
        else {
            System.out.println("Imaginary Roots");
        }

        sc.close(); // close scanner
    }
}
