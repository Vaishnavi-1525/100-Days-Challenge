import java.util.*;

public class day81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // number of test cases
        sc.nextLine(); // consume newline

        for (int i = 0; i < T; i++) {
            String feedback = sc.nextLine();
            
            if (feedback.contains("010") || feedback.contains("101")) {
                System.out.println("Good");
            } else {
                System.out.println("Bad");
            }
        }
        sc.close();
    }
}
