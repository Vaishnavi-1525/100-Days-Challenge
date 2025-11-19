import java.util.*;

public class day97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String[] arr = new String[N];
            
            for (int i = 0; i < N; i++) {
                arr[i] = sc.next();
            }
            
            // Construct diagonal string
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < N; i++) {
                char c = arr[i].charAt(i);
                // Flip: 0 -> 1, 1 -> 0
                result.append(c == '0' ? '1' : '0');
            }
            
            // Output new string
            System.out.println(result.toString());
        }
        
        sc.close();
    }
}
