import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args)
     {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the sentence : ");
        String text=input.nextLine();
       // String[] textarr=text.split(" ");
        System.out.println("reversed String : ");
        // for(int i=textarr.length-1 ; i>=0 ; i--)
        // {
        //     System.out.print(textarr[i] + " ");
        // }
        System.out.print(reverseWord(text));
        input.close();
     }
     public static String reverseWord(String str)
     {
        String[] words = str.split(" ");
        return reversePrint(words, words.length - 1);
    }

    private static String reversePrint(String[] words, int index) {
        if (index == 0)
        {
            return words[index]; 
        }
        return words[index] + " " + reversePrint(words, index - 1); 
    }
}
