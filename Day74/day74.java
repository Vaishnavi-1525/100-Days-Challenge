import java.util.*;

public class day74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); // number of test cases
        
        while (T-- > 0) {
            int M = sc.nextInt(); // mass in kilograms
            int H = sc.nextInt(); // height in meters
            
            int BMI = M / (H * H); // calculate BMI
            
            if (BMI <= 18)
                System.out.println(1);
            else if (BMI >= 19 && BMI <= 24)
                System.out.println(2);
            else if (BMI >= 25 && BMI <= 29)
                System.out.println(3);
            else
                System.out.println(4);
        }
        
        sc.close();
    }
}
