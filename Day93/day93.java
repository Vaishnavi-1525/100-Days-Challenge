import java.util.*;

public class day93 {

    public static long weightOfSubarray(int[] A, int L, int R) {
        // For a subarray A[L...R], pick j in between such that:
        // (A[j] - A[L]) * (A[R] - A[j]) is maximized.
        // Since A is sorted, best j is closer to middle.
        
        long maxWeight = 0;
        for (int j = L + 1; j < R; j++) {
            long left = A[j] - A[L];
            long right = A[R] - A[j];
            long weight = left * right;
            if (weight > maxWeight) {
                maxWeight = weight;
            }
        }
        return maxWeight;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            long totalSum = 0;

            // Generate all subarrays of length >= 3
            for (int L = 0; L < N; L++) {
                for (int R = L + 2; R < N; R++) {
                    totalSum += weightOfSubarray(A, L, R);
                }
            }

            System.out.println(totalSum);
        }

        sc.close();
    }
}
