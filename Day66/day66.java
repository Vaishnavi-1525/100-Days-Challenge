import java.util.*;

public class day66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate sum of squares
        int sum = 0;
        for (int num : arr) {
            sum += num * num;
        }

        // Output result
        System.out.println(sum);

        sc.close();
    }
}
