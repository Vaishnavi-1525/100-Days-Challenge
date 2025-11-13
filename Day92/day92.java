import java.util.*;

public class day92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // number of test cases
        
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            
            for (int x : A) {
                if (x > max) max = x;
                if (x < min) min = x;
            }
            
            int result = (max - min) * max;
            System.out.println(result);
        }
        
        sc.close();
    }
}
