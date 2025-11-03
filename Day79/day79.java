import java.util.Scanner;

public class day79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of test cases
        int T = sc.nextInt();

        // Process each test case
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); // number of friends
            int X = sc.nextInt(); // total gold in kg
            int Y = sc.nextInt(); // capacity of each person in kg

            // Total capacity of all people (N friends + Anusree)
            int totalCapacity = (N + 1) * Y;

            // Check if they can carry all gold
            if (totalCapacity >= X) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
