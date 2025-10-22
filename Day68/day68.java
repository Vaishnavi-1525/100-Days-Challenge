import java.util.*;

public class day68 {
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

        int maxProduct = arr[0];
        int minProduct = arr[0];
        int result = arr[0];
        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < n; i++) {
            int num = arr[i];

            if (num < 0) {
                // Swap max and min if negative number
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            if (num > maxProduct * num) {
                maxProduct = num;
                tempStart = i;
            } else {
                maxProduct = maxProduct * num;
            }

            minProduct = Math.min(num, minProduct * num);

            if (maxProduct > result) {
                result = maxProduct;
                end = i;
                start = tempStart;
            }
        }

        // Print result
        System.out.print(result + " = {");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]);
            if (i < end) System.out.print(", ");
        }
        System.out.println("}");

        sc.close();
    }
}
