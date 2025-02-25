import java.util.Scanner;
public class Letters {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a alphapet(A-Z):");
        char ch=input.next().charAt(0);
        //String output="";
        if(ch>='A' && ch<='Z')
        {
            for(char i=ch;i<='Z' ; i++)
            {
                System.out.print(i + " ");
            }
        }
        else
        {
            System.out.println("Invalid input!...enter a valid input!");
        }
        input.close();
        
    }
}
