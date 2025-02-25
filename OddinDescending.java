import java.util.Arrays;
import java.util.Scanner;
public class OddinDescending {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=input.nextInt();
        System.out.println("Enter the "+n+" elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.println("Array:"+Arrays.toString(arr));
        int[] oddIndices = new int[(n + 1) / 2];
        int[] evenIndices = new int[n / 2];

        // Store elements at odd and even indices separately
        for (int i = 0, oddIdx = 0, evenIdx = 0; i < n; i++) {
            if (i % 2 == 0) {
                oddIndices[oddIdx++] = arr[i];
            } else {
                evenIndices[evenIdx++] = arr[i];
            }
        }

        // Sort odd indices in descending order
        Arrays.sort(oddIndices);
        reverseArray(oddIndices);

        // Sort even indices in ascending order
        Arrays.sort(evenIndices);

        // Merge sorted elements back into the array
        for (int i = 0, oddIdx = 0, evenIdx = 0; i < n; i++)
         {
            if (i % 2 == 0) {
                arr[i] = oddIndices[oddIdx++];
            } else {
                arr[i] = evenIndices[evenIdx++];
            }
        }
        System.out.println("ordered Array:"+Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
       
    }
}

