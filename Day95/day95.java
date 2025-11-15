import java.util.*;

public class day95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            HashMap<Integer, Integer> freq = new HashMap<>();

            for (int x : arr) {
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }

            boolean possible = true;

            for (int count : freq.values()) {
                if (count % 2 != 0) {
                    possible = false;
                    break;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }
        sc.close();
    }
}
