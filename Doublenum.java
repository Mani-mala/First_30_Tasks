import java.util.Scanner;
import java.math.BigDecimal;
public class Doublenum {
    public static void main(String[] args)
     {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number: ");
        double num=input.nextDouble();
        System.out.printf("%.2f %n",num);

        BigDecimal number = new BigDecimal("7.500");
        System.out.println(number.setScale(2));
        input.close();
    }
}
