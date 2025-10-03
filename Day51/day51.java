public class day51
 {
    public static void main(String[] args) 
	{
        String input = "abc123def45ghi7";
        int sum = 0;    // final result
        String temp = "0"; // to hold digits

        for (int i = 0; i < input.length(); i++) 
		{
            char ch = input.charAt(i);

            // If current char is a digit, add to temp
            if (Character.isDigit(ch)) 
			{
                temp += ch;
            } else 
			{
                // Add the number collected so far
                sum += Integer.parseInt(temp);
                temp = "0"; // reset for next number
            }
        }

        // Add the last number if any
        sum += Integer.parseInt(temp);

        System.out.println("Sum of numbers in string: " + sum);
    }
}
