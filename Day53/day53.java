import java.util.Scanner;

public class day53
  {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Convert to lowercase for uniformity
        str = str.toLowerCase();

        int[] freq = new int[256]; // ASCII size array

        // Count frequency
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') { // ignore spaces
                freq[ch]++;
            }
        }

        // Print frequencies
        System.out.println("\nCharacter Frequencies:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " → " + freq[i]);
            }
        }

        sc.close();
    }
}
