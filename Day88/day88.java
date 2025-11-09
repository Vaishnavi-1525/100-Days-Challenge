import java.util.*;

public class day88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // number of test cases
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            int count = 0;
            for (int i = 0; i < N; i++) {
                int lessOrEqual = 0, greater = 0;
                for (int j = 0; j < N; j++) {
                    if (A[j] <= A[i]) lessOrEqual++;
                    else greater++;
                }
                if (lessOrEqual > greater)
                    count++;
            }
            System.out.println(count);
        }
        sc.close();
    }
}
