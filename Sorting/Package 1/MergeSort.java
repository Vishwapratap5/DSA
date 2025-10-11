import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 10, 9, 8, 4, 25, 1, 5};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    // Recursive divide step
    private static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2; // avoids overflow
            mergeSort(arr, start, mid);          // sort left half
            mergeSort(arr, mid + 1, end);        // sort right half
            merge(arr, start, mid, end);         // merge both halves
        }
    }

    // Merge two sorted halves
    private static void merge(int[] arr, int start, int mid, int end) {
        // Find sizes of the two subarrays to be merged
        int n1 = mid - start + 1;
        int n2 = end - mid;

        // Create temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++)
            L[i] = arr[start + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        // Merge temp arrays
        int i = 0, j = 0;
        int k = start; // Start index for merged array

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[], if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[], if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
