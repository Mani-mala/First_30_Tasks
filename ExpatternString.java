import java.util.Scanner;
public class ExpatternString
{
public static void main(String[] args)
{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the string for X pattern");
    String str=input.nextLine();
    int num=str.length();
	for(int i=0;i<num;i++)
	{
		for(int j=0;j<num;j++)
		{
			if(j==i || j==(num-i-1))
			{
			  System.out.print(str.charAt(j)+" ");
			}
			else  
 			{
			  System.out.print("  ");
			}
		}
		
		System.out.println();
	}
    input.close();

}
}