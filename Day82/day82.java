import java.util.*;

public class day82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // number of test cases
        
        while (T-- > 0) {
            int N = sc.nextInt();  // number of tablets
            int B = sc.nextInt();  // budget
            int maxArea = 0;       // track largest area

            for (int i = 0; i < N; i++) {
                int W = sc.nextInt();  // width
                int H = sc.nextInt();  // height
                int P = sc.nextInt();  // price

                if (P <= B) {
                    int area = W * H;
                    if (area > maxArea) {
                        maxArea = area;
                    }
                }
            }

            if (maxArea == 0)
                System.out.println("no tablet");
            else
                System.out.println(maxArea);
        }
        sc.close();
    }
}
