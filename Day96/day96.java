import java.util.*;

public class day96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            
            // Check if already sorted
            if (isSorted(S)) {
                System.out.println(0);
                continue;
            }
            
            // Check if all 1s are before all 0s (only one block of inversion)
            if (oneInversionBlock(S)) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
        
        sc.close();
    }

    // Check if string is already sorted (000...111)
    static boolean isSorted(String s) {
        return !s.contains("10");
    }

    // Check if all 1s appear before all 0s but possibly scattered: "1001", "11000"
    static boolean oneInversionBlock(String s) {
        int firstZero = s.indexOf('0');
        int lastOne = s.lastIndexOf('1');
        
        // If first zero comes after last one, only one inversion block exists
        return firstZero > lastOne;
    }
}
