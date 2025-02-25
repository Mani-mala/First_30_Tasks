import java.util.Scanner;
public class NumberPattern1
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) 
        {
            // Print leading spaces for alignment
            for (int j = num; j > i; j--) 
            {
                System.out.print("  ");
            }
            // Print increasing numbers
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(j + " ");
            }
            // Print decreasing numbers
            for (int j = i - 1; j >= 1; j--) 
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }           
        input.close();    
    }

}