import java.util.Scanner;

public class 59
  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean increasing = true;
        boolean decreasing = true;

        // Check the array type
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                increasing = false;
            }
            if (arr[i] > arr[i - 1]) {
                decreasing = false;
            }
        }

        // Determine result
        if (increasing && decreasing) {
            System.out.println("Array is Both (all elements are equal)");
        } else if (increasing) {
            System.out.println("Array is Increasing");
        } else if (decreasing) {
            System.out.println("Array is Decreasing");
        } else {
            System.out.println("Array is Random");
        }

        sc.close();
    }
}
