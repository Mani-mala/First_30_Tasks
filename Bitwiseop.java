import java.util.Scanner;

public class Bitwiseop {
    public static void main(String[] args)
    {
        int num1,num2;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1=input.nextInt();
        System.out.println("Enter second number: ");
        num2=input.nextInt();
        System.out.println("Binary Representation of num1 : "+ Integer.toBinaryString(num1));
        System.out.println("Binary Representation of num2 : "+ Integer.toBinaryString(num2));

        System.out.println("Bitwise operator:");
        System.out.println();
        System.out.println("& Bitwise AND :"+(num1&num2) +" , "+ Integer.toBinaryString(num1&num2));
        System.out.println("| Bitwise OR :"+(num1|num2) +" , "+ Integer.toBinaryString(num1|num2));
        System.out.println("^ Bitwise XOR :"+(num1^num2) +" , "+ Integer.toBinaryString(num1^num2));
        System.out.println("~ Bitwise Complement of num1 :"+(~num1) +" , "+ Integer.toBinaryString(~num1));
        System.out.println("~ Bitwise Complement of num2 :"+(~num2) +" , "+ Integer.toBinaryString(~num2));
        System.out.println("<< Bitwise Left shift of num1 :"+ (num1 << 2) +" , "+ Integer.toBinaryString(num1 << 2));
        System.out.println(">> Bitwise Right Shift of num1 :"+ (num1 >> 2) +" , "+ Integer.toBinaryString(num1 >> 2));
        System.out.println("<< Bitwise Left shift of num2 :"+ (num2 << 2) +" , "+ Integer.toBinaryString(num2 << 2));
        System.out.println(">> Bitwise Right Shift of num2 :"+ (num2 >> 2) +" , "+ Integer.toBinaryString(num2 >> 2));
        System.out.println(">>> Unsigned right shift of num1 :"+ (num1 >>> 2) +" , "+ Integer.toBinaryString(num1 >>> 2));
        System.out.println(">>> Unsigned Right Shift of num1 :"+ (num2 >>> 2) +" , "+ Integer.toBinaryString(num2 >>> 2));

        input.close();

    }
}
