import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={4,3,1,5,9,2,8};
        InsertionSort.sort(arr);
    }

    private static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int Current_Element = arr[i];
            int Previous_Index = i - 1;
            while(Previous_Index >= 0 && arr[Previous_Index] > Current_Element) {
                arr[Previous_Index+1] = arr[Previous_Index];
                Previous_Index--;
            }
            arr[Previous_Index+1] = Current_Element;
        }
        System.out.println(Arrays.toString(arr));
    }
}
