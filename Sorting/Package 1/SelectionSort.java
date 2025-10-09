import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,22,11,9,8};
        System.out.println("Array before sorting:"+ Arrays.toString(arr));
        SelectionSort.Sort(arr);
        System.out.println("Array after sorting:"+ Arrays.toString(arr));
    }

    private static void Sort(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[j]<arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
