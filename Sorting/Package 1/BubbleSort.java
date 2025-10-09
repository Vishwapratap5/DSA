import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,22,11,9,8};
        System.out.println("Array before sorting:"+ Arrays.toString(arr));
        BubbleSort.Sort(arr);
        System.out.println("Array after sorting:"+ Arrays.toString(arr));
    }

    private static void Sort(int[] arr) {
        boolean swapped = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                return;
            }
        }
    }
}
