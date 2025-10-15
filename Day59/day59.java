import java.util.Scanner;

public class day59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Flags to check odd and even presence
        boolean hasOdd = false;
        boolean hasEven = false;

        // Check each element
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                hasEven = true;
            } else {
                hasOdd = true;
            }
        }

        // Determine array type
        if (hasOdd && !hasEven) {
            System.out.println("Odd");
        } else if (hasEven && !hasOdd) {
            System.out.println("Even");
        } else {
            System.out.println("Mixed");
        }

        sc.close();
    }
}
