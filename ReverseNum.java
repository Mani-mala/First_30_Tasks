import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args)
     {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number=input.nextInt();
        int num=0;
        while(number!=0)
        {
            num=num*10 + number%10;
            number=number/10;
        } 
        System.out.println("Reverse number : "+num);
        input.close();
     }
}
