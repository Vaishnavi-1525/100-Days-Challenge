import java.util.Arrays;
import java.util.Scanner;

public class day55
    {
    public static void main(String[] args)
        {
        Scanner sc = new Scanner(System.in);

        //  Take two strings as input
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        //  Remove spaces and convert to lowercase for uniformity
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        //  If lengths are not same, they can't be anagrams
        if (str1.length() != str2.length()) {
            System.out.println(" Not Anagram");
        } else {
            //  Convert strings to char arrays
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            // 👉 Sort both arrays
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            // 👉 Compare both arrays
            if (Arrays.equals(arr1, arr2)) {
                System.out.println(" Strings are Anagram");
            } else {
                System.out.println(" Not Anagram");
            }
        }

        sc.close();
    }
}
