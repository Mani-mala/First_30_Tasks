import java.util.Scanner;
public class StringComparison
{
public static void main(String[] args)
{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the first string");
    String str1=input.nextLine();
    System.out.println("Enter the second string");
    String str2=input.nextLine();
   // int index = str1.indexOf(str2);
    int index=indexofString(str1,str2);
    System.out.println("First occurance of the substring : "+index);
    input.close();

}
    public static int indexofString(String str1,String str2)
    {
        for(int i=0;i<str1.length()-str2.length()+1; i++)
        {
            if(str1.substring(i).startsWith(str2))
            {
                return i;
            }
        }
        return -1;
    }
 
}