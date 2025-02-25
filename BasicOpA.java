import java.util.Scanner;
public class BasicOpA {
    public static void main(String[] args)
     {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the 'a' value");
        int a=input.nextInt();  
        System.out.println(a+=a++ + ++a + -a + a);
        input.close();
     } 
}
