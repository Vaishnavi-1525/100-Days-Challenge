import java.util.*;

public class day50
  {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an algebraic expression:");
        String expression = sc.nextLine();

        StringBuilder result = new StringBuilder();

        // Loop through each character
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            // Skip brackets
            if (ch == '(' || ch == ')' || ch == '{' || ch == '}' || ch == '[' || ch == ']') {
                continue;
            } else {
                result.append(ch);
            }
        }

        System.out.println("Expression without brackets: " + result.toString());
        sc.close();
    }
}
