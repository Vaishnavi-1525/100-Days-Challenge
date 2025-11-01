import java.util.Scanner;

public class day78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of test cases
        int T = sc.nextInt();

        // Process each test case
        for (int t = 0; t < T; t++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int total = a + b;

            // Determine format based on total
            if (total < 3) {
                System.out.println(1); // Bullet
            } else if (total <= 10) {
                System.out.println(2); // Blitz
            } else if (total <= 60) {
                System.out.println(3); // Rapid
            } else {
                System.out.println(4); // Classical
            }
        }

        sc.close();
    }
}
