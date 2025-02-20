import java.util.Scanner;
public class AddOnes
{
public static void main(String[] args)
{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the size of the series");
    int num=input.nextInt();
    int sum=0 , term=1;
    for(int i=1;i<=num;i++)
    {
        for(int j=0;j<i;j++)
        {
            System.out.print("1");
        }
        sum += term;
        term = term * 10 + 1;
        if(i==num)
        {
            break;
        }    
        System.out.print("+");
    }
    System.out.println();
    System.out.println("Addition of the series = "+sum);
    input.close();

}
}