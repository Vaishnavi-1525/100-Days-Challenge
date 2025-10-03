import java.util.Scanner;

public class day52
  {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) 
        {
            if (word.length() == 1)
            {
                result.append(Character.toUpperCase(word.charAt(0))).append(" ");
            }
            else 
            {
                char first = Character.toUpperCase(word.charAt(0));
                char last = Character.toUpperCase(word.charAt(word.length() - 1));
                String middle = word.substring(1, word.length() - 1);
                result.append(first).append(middle).append(last).append(" ");
            }
        }

        System.out.println("Result: " + result.toString().trim());
        sc.close();
    }
}
