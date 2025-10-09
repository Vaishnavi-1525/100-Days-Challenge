import java.util.Scanner;

public class day57
  {

    // Function to check if text matches pattern with wildcards
    public static boolean isMatch(String text, String pattern) {
        int t = 0, p = 0, starIndex = -1, matchIndex = 0;

        while (t < text.length()) {
            // If current characters match or pattern has '?'
            if (p < pattern.length() && (pattern.charAt(p) == '?' || pattern.charAt(p) == text.charAt(t))) {
                t++;
                p++;
            }
            // If pattern contains '*', mark this position
            else if (p < pattern.length() && pattern.charAt(p) == '*') {
                starIndex = p;
                matchIndex = t;
                p++;
            }
            // If mismatch occurs and previous '*' exists, backtrack
            else if (starIndex != -1) {
                p = starIndex + 1;
                matchIndex++;
                t = matchIndex;
            }
            // If mismatch and no '*', return false
            else {
                return false;
            }
        }

        // Check for remaining '*' in pattern
        while (p < pattern.length() && pattern.charAt(p) == '*') {
            p++;
        }

        return p == pattern.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 🔸 Input text
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // 🔸 Input pattern
        System.out.print("Enter pattern: ");
        String pattern = sc.nextLine();

        // 🧠 Check match
        if (isMatch(text, pattern)) {
            System.out.println("Strings Match");
        } else {
            System.out.println("Strings Do Not Match");
        }

        sc.close();
    }
}
