import java.util.Scanner;
public class IncreasingNumpattern
{
public static void main(String[] args)
{
	int num;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the number of elements");
	num=input.nextInt();
	int count = 1; 
    int rows = 1; 
        while (rows * (rows + 1) / 2 < num) 
        {
            rows++;
        }
        for (int i = 1; i <= rows; i++) 
        {
            for (int space = rows; space > i; space--) 
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i && count <= num; j++) 
            {
                System.out.print(count + " ");
                count++;
            }

            System.out.println();
        }

	input.close();
}
}