import java.util.Scanner;

public class day61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array :");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements :");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int smallest = arr[0];
        int largest = arr[0];

        for (int i = 1; i < size; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Smallest Number :");
        System.out.println(smallest);

        System.out.println("Largest Number :");
        System.out.println(largest);
    }
}
