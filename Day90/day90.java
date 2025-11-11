
import java.util.*;

public class day90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            int[] freq = new int[26];
            int ans = 0;

            for (int i = 0; i < N; i++) {
                char c = S.charAt(i);
                freq[c - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                if (freq[i] >= 2)
                    ans = Math.max(ans, Math.min(freq[i], 2));
            }

            // Check for longest consecutive boring substring
            int current = 1, maxLen = 0;
            for (int i = 1; i < N; i++) {
                if (S.charAt(i) == S.charAt(i - 1)) current++;
                else {
                    if (current > maxLen) maxLen = current;
                    current = 1;
                }
            }
            maxLen = Math.max(maxLen, current);
            
            if (maxLen >= 2) ans = Math.max(ans, Math.min(maxLen, 2));
            System.out.println(ans);
        }

        sc.close();
    }
}
