import java.util.Scanner;
public class Basicop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the 'a' value");
        int a=input.nextInt();
        System.out.println("Enter the 'b' value");
        int b=input.nextInt();
        int result1= ++a - b;
        System.out.println("++a-b = "+ result1);
        int result2= a % b++;
        System.out.println("a % b++ = "+ result2);
         a*= b + 5;
         int result3=a;
        System.out.println("a*=b+5 = "+ result3);
        int result4=69>>>2;
        System.out.println("69>>>2 = "+ result4);
        input.close();
    }
}
