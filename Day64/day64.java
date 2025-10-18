import java.util.*;

public class day64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of arrays: ");
        int n = sc.nextInt();

        int[] X = new int[n];
        int[] Y = new int[n];

        System.out.println("Enter elements of first array (X):");
        for (int i = 0; i < n; i++) {
            X[i] = sc.nextInt();
        }

        System.out.println("Enter elements of second array (Y):");
        for (int i = 0; i < n; i++) {
            Y[i] = sc.nextInt();
        }

        // Sort X ascending
        Arrays.sort(X);

        // Sort Y descending
        Arrays.sort(Y);
        for (int i = 0; i < n / 2; i++) {
            int temp = Y[i];
            Y[i] = Y[n - i - 1];
            Y[n - i - 1] = temp;
        }

        // Calculate minimum scalar product
        int minScalarProduct = 0;
        for (int i = 0; i < n; i++) {
            minScalarProduct += X[i] * Y[i];
        }

        System.out.println("Minimum Scalar Product: " + minScalarProduct);

        sc.close();
    }
}
