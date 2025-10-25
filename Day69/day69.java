import java.util.*;

public class day69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first array
        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input second array
        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        // Store first array elements in a HashSet
        Set<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }

        // Check for common elements
        boolean disjoint = true;
        int commonElement = 0;

        for (int num : arr2) {
            if (set.contains(num)) {
                disjoint = false;
                commonElement = num;
                break;
            }
        }

        // Output result
        if (disjoint) {
            System.out.println("Disjoint");
        } else {
            System.out.println("Not disjoint. (" + commonElement + " is common)");
        }

        sc.close();
    }
}
