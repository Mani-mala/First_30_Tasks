
import java.util.Scanner;
import java.util.Arrays;
public class MinElement {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int size=input.nextInt();
        System.out.println("Enter the "+size+" int elements:");
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int min=arr[0];
        for(int i=1;i<size;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println("Smallest element in a array : "+min);
        input.close();
    }

}
