import java.util.*;

public class day100 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int C = sc.nextInt();

            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            int steps = 0;
            int i = 0;

            while (i + K - 1 < N) {
                boolean valid = true;

                for (int j = i; j < i + K - 1; j++) {
                    if (arr[j + 1] < arr[j] * C) {
                        valid = false;
                        break;
                    }
                }

                if (valid) {
                    steps++;
                    i += K; // delete K items
                } else {
                    i++; // try different group
                }
            }

            System.out.println(steps);
        }
        sc.close();
    }
}
