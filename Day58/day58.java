import java.util.Scanner;

public class day58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of first array
        System.out.print("Enter the size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        // Input elements of first array
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input size of second array
        System.out.print("Enter the size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        // Input elements of second array
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Check if arrays are same
        boolean isSame = true;

        // If lengths differ, they're not the same
        if (n1 != n2) {
            isSame = false;
        } else {
            // Compare each element
            for (int i = 0; i < n1; i++) {
                if (arr1[i] != arr2[i]) {
                    isSame = false;
                    break;
                }
            }
        }

        // Output result
        if (isSame) {
            System.out.println(" Both arrays are the SAME.");
        } else {
            System.out.println(" Arrays are NOT the same.");
        }

        sc.close();
    }
}
