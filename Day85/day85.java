import java.util.*;

public class day85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();  // number of queries
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < Q; i++) {
            int type = sc.nextInt();
            int x = sc.nextInt();

            if (type == 1) {
                set.add(x);
            } else if (type == 2) {
                set.remove(x);
            } else if (type == 3) {
                if (set.contains(x))
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }

        sc.close();
    }
}
