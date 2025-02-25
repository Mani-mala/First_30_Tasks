import java.util.Scanner;
public class Groupnum {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a total number of Students : ");
        int n=input.nextInt();
        int rollnum;
        int groups=4;
        for(int i=1;i<=groups ; i++)
        {
            System.out.println("Group "+i+ " :");
            rollnum=100+i;
            for(int j=rollnum; j<101+n ; j+=4)
            {
                System.out.println(j);
            }

        }
        input.close();
    }
}
