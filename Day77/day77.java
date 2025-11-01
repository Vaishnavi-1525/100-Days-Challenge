
import java.util.Scanner;

public class day77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of test cases
        int T = sc.nextInt();

        // Process each test case
        for (int t = 0; t < T; t++) {
            int sunnyCount = 0;

            // Read 7 days data
            for (int i = 0; i < 7; i++) {
                int day = sc.nextInt();
                if (day == 1) {
                    sunnyCount++;
                }
            }

            int rainyCount = 7 - sunnyCount;

            // Check weather condition
            if (sunnyCount > rainyCount) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
