import java.util.Scanner;

public class day63 {

    // Method to check if a number is palindrome
    public static boolean isPalindrome(int num) {
        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int longestPalindrome = -1;  // to store the longest palindrome found

        for (int num : arr) {
            if (isPalindrome(num)) {
                if (num > longestPalindrome) {
                    longestPalindrome = num;
                }
            }
        }

        if (longestPalindrome != -1)
            System.out.println("Longest palindrome number: " + longestPalindrome);
        else
            System.out.println("No palindrome number found in the array.");

        sc.close();
    }
}
