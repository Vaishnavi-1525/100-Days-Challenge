import java.util.*;

public class day75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); // number of test cases
        
        while (T-- > 0) {
            int sunny = 0;
            
            // read 7 integers (1 for sunny, 0 for rainy)
            for (int i = 0; i < 7; i++) {
                int day = sc.nextInt();
                if (day == 1)
                    sunny++;
            }
            
            int rainy = 7 - sunny;
            
            if (sunny > rainy)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        
        sc.close();
    }
}
