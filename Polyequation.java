import java.util.Scanner;

public class Polyequation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the co-efficient of x^2 and x and constant value");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        double result1,result2;
        System.out.println("The equation is : "+a+"x^2 + "+b+"x + "+c);

        result1 = (-b + (Math.sqrt(b*b - (4*a*c))))/ (2*a) ;
        System.out.println("x = "+result1);
        result2 = (-b - (Math.sqrt(b*b - (4*a*c))))/ (2*a) ;
        System.out.println("x = "+result2);
        input.close();
    }
}
