import java.util.*;

public class day84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int S = sc.nextInt();
            int W1 = sc.nextInt();
            int W2 = sc.nextInt();
            int W3 = sc.nextInt();

            int hits;

            if (W1 + W2 + W3 <= S) {
                hits = 1;
            } else if (W1 + W2 <= S || W2 + W3 <= S) {
                hits = 2;
            } else {
                hits = 3;
            }

            System.out.println(hits);
        }
        sc.close();
    }
}
