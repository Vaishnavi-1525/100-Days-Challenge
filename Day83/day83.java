import java.util.*;

public class day83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); // consume newline

        while (T-- > 0) {
            String A = sc.nextLine();
            String B = sc.nextLine();
            boolean found = false;

            for (int i = 0; i < A.length(); i++) {
                if (B.indexOf(A.charAt(i)) != -1) {
                    found = true;
                    break;
                }
            }

            if (found)
                System.out.println("Yes");
            else
                System.out.println("No");
        }

        sc.close();
    }
}
