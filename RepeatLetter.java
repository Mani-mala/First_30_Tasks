import java.util.Scanner;
public class RepeatLetter {
    public static void main(String[] args)
     {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the String 'ex=a1b3m5w2' : ");
        String text=input.nextLine();
        StringBuilder output = new StringBuilder();
        int i = 0;

        while (i < text.length()) 
        {
            char letter = text.charAt(i);
            i++; 
            StringBuilder numStr = new StringBuilder(); 
            while (i < text.length() && Character.isDigit(text.charAt(i))) 
            {
                numStr.append(text.charAt(i));
                i++;
            }
            int count = Integer.parseInt(numStr.toString());
            for (int j = 0; j < count; j++)
            {
                output.append(letter);
            }
        }
        System.out.println("Output: " + output);
        input.close();
     }
}