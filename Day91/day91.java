import java.util.*;

public class day91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            if (N == 0) {
                System.out.println(0);
            } else if (K == 0 || N % K != 0) {
                System.out.println(-1);
            } else {
                System.out.println(N / K);
            }
        }
        sc.close();
    }
}
