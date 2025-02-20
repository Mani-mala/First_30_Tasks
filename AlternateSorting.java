import java.util.Scanner;
import java.util.Arrays;
public class AlternateSorting
 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int size=input.nextInt();
        System.out.println("Enter the "+size+" elements in sorted order:");
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.println("Array : "+Arrays.toString(arr));
        int index=0,left=0,right=size-1;
        int arr1[]=new int[size];
        while(left<=right)
        {
            arr1[index]=arr[right];
            right--;
            index++;
           if(index<size)
           {
            arr1[index]=arr[left];
            left++;
            index++;
           }
           
        }
        System.out.println("Array : "+Arrays.toString(arr1));
        input.close();

    }
 }