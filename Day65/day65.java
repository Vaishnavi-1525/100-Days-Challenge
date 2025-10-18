import java.util.*;

public class day65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Remove duplicates using LinkedHashSet (preserves order)
        Set<Integer> unique = new LinkedHashSet<>();
        for (int num : arr) {
            unique.add(num);
        }

        // Display the result
        System.out.println("Array after removing duplicates:");
        for (int num : unique) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
