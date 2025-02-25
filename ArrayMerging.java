import java.util.TreeSet;

public class ArrayMerging {
    public static void main(String[] args) {
        int arr1[]={2,4,5,7,8,9,10};
        int arr2[]={1,2,3,4,6,7,9,10,11,12}; //sorted arrays
        TreeSet<Integer> set= new TreeSet<>();
        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            set.add(num);
        }
        System.out.println("Merged array:");
        for (int num : set) {
            System.out.print(num + " ");
        }

    }
}
