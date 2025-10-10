import java.util.Scanner;

public class day56
{
    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);

        //  Input original string
        System.out.print("Enter the original string: ");
        String original = sc.nextLine();

        //  Input substring to be replaced
        System.out.print("Enter the substring to replace: ");
        String oldSub = sc.nextLine();

        //  Input new substring
        System.out.print("Enter the new substring: ");
        String newSub = sc.nextLine();

        //  Replace substring using replace() method
        String modified = original.replace(oldSub, newSub);

        //  Output the final string
        System.out.println("Modified string: " + modified);

        sc.close();
    }
}
