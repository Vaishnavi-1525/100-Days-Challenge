import java.util.*;

public class day72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); // number of test cases
        
        while (T-- > 0) {
            int N = sc.nextInt(); // total questions
            int X = sc.nextInt(); // correct answers
            int P = sc.nextInt(); // passing marks
            
            int total = (4 * X) - N; // formula
            
            if (total >= P)
                System.out.println("PASS");
            else
                System.out.println("FAIL");
        }
        
        sc.close();
    }
}
