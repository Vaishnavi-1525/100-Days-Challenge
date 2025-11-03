import java.util.Scanner;

public class day80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of test cases
        int T = sc.nextInt();

        // Process each test case
        for (int t = 0; t < T; t++) {
            int w1 = sc.nextInt(); // before lockdown
            int w2 = sc.nextInt(); // after lockdown
            int x1 = sc.nextInt(); // min possible gain per month
            int x2 = sc.nextInt(); // max possible gain per month
            int M = sc.nextInt();  // months

            int weightGain = w2 - w1;
            int minPossible = M * x1;
            int maxPossible = M * x2;

            if (weightGain >= minPossible && weightGain <= maxPossible) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

        sc.close();
    }
}
