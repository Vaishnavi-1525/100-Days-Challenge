// 🌟 Day 59 – Body Mass Index (BMI)

import java.util.Scanner;

public class day76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of test cases
        int T = sc.nextInt();

        // Process each test case
        for (int i = 0; i < T; i++) {
            int M = sc.nextInt(); // mass in kg
            int H = sc.nextInt(); // height in meters

            // Calculate BMI
            int bmi = M / (H * H);

            // Determine the category
            if (bmi <= 18) {
                System.out.println(1);
            } else if (bmi >= 19 && bmi <= 24) {
                System.out.println(2);
            } else if (bmi >= 25 && bmi <= 29) {
                System.out.println(3);
            } else {
                System.out.println(4);
            }
        }

        sc.close();
    }
}
