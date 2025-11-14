import java.util.*;

public class day94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();

            int operations = 0;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == '1') {
                    operations++; 
                    // skip all consecutive 1s (since they form one group)
                    while (i < N && S.charAt(i) == '1') {
                        i++;
                    }
                }
            }

            System.out.println(operations);
        }
        sc.close();
    }
}
