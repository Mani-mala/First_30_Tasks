import java.util.Scanner;
public class RectangleStarpattern
{
public static void main(String[] args)
{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the size for rectangle diamond pattern :");
    int n=input.nextInt();
	int size = n*2;
        
	for (int i = 0; i < n; i++) 
	{
		for (int j = 0; j < size; j++) 
		{
			if (j < (n - i) || j >= (size - (n - i))) 
			{
				System.out.print("*");
			} else {
				System.out.print("_");
			}
		}
		System.out.println();
	}
	
	for (int i = n - 2; i >= 0; i--) 
	{
		for (int j = 0; j < size; j++) {
			if (j < (n - i) || j >= (size - (n - i))) {
				System.out.print("*");
			} else {
				System.out.print("_");
			}
		}
		System.out.println();
	}
	input.close();
}
}	
