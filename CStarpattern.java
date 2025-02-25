import java.util.Scanner;
public class CStarpattern
{
public static void main(String[] args)
{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the size for 'C' letter");
    int n=input.nextInt();
	for(int i=0; i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(i==0 || i==n-1 || j==0)
			{
				System.out.print(" *");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	input.close();
}
}	