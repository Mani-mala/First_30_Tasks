import java.util.Scanner;
import java.util.Arrays;
public class ArrayCopy {
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
        System.out.println("Original Array : "+Arrays.toString(arr));
      //  int[] copyarr = Arrays.copyOf(arr, arr.length);
        int[] copyarr=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            copyarr[i]=arr[i];
        }
        System.out.println("Copied Array : "+Arrays.toString(copyarr));
        input.close();
    }
}