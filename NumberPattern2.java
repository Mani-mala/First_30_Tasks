import java.util.Scanner;
public class NumberPattern2
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) 
        {
            for (int j = num; j > i; j--) 
            {
                System.out.print("  ");
            }
            for (int j = num-i+1; j <=num; j++) 
            {
                System.out.print( j+ " ");
            }
            for (int j = num-1; j >= num-i+1; j--) 
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }           
        input.close();    
    }

}