import java.util.*;

public class day70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] X = new int[n];
        int[] Y = new int[n];
        
        for (int i = 0; i < n; i++) X[i] = sc.nextInt();
        for (int i = 0; i < n; i++) Y[i] = sc.nextInt();
        
        Arrays.sort(X);
        Arrays.sort(Y);
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += X[i] * Y[i];
        }
        
        System.out.println(sum);
        sc.close();
    }
}
