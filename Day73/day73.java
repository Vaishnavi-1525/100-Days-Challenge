import java.util.*;

public class day73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); // number of test cases
        
        while (T-- > 0) {
            int K = sc.nextInt(); // bucket capacity
            int X = sc.nextInt(); // already filled
            
            int extra = K - X; // remaining capacity
            
            System.out.println(extra);
        }
        
        sc.close();
    }
}
