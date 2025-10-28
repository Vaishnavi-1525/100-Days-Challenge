import java.util.*;

public class day71 {
    
    // Function to reduce a number by removing all factors of 2 and 3
    public static int reduceNum(int num) {
        while (num % 2 == 0)
            num /= 2;
        while (num % 3 == 0)
            num /= 3;
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Reduce all numbers
        int base = reduceNum(arr[0]);
        boolean possible = true;
        
        for (int i = 1; i < n; i++) {
            if (reduceNum(arr[i]) != base) {
                possible = false;
                break;
            }
        }
        
        if (possible)
            System.out.println("Yes");
        else
            System.out.println("No");
        
        sc.close();
    }
}
