import java.util.Scanner;
public class AsciiChar {
    public static void main(String[] args)
     {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Character");
        char ch=input.next().charAt(0);
        int ascii=ch;
        System.out.println("'"+ch+"' ASCII value = "+ ascii);
        input.close();
     }

}
