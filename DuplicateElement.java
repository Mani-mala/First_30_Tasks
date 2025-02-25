import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
public class DuplicateElement
 {
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
        System.out.println("Duplicate elements in the array:");
        HashSet<Integer> printed = new HashSet<>(); 
        for (int i = 0; i < size; i++) 
        {
            for (int j = i + 1; j < size; j++) 
            {
                if (arr[i] == arr[j] && !printed.contains(arr[i])) 
                { 
                    System.out.print(arr[i] + " ");
                    printed.add(arr[i]);
                    break;
                }
            }
        }
        input.close();
    }
 }