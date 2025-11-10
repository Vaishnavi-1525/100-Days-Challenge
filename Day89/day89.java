
import java.util.*;

public class day89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        StringBuilder S = new StringBuilder();

        for (int q = 0; q < Q; q++) {
            String type = sc.next();

            if (type.equals("+")) {
                int i = sc.nextInt();
                String x = sc.next();
                S.insert(i, x);
            } else if (type.equals("?")) {
                int i = sc.nextInt();
                int len = sc.nextInt();
                int start = i - 1;
                int end = Math.min(start + len, S.length());
                System.out.println(S.substring(start, end));
            }
        }
        sc.close();
    }
}
