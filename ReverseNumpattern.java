import java.util.Scanner;
public class ReverseNumpattern {
    public static void main(String[] args)
    {
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the number of rows for reverse triangle star pattern :");
	int num=input.nextInt();
	for (int i = num; i >= 1; i--) 
    {   
        for (int j= 0; j < num-i; j++) 
        {
            System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) 
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    input.close();
}
}
