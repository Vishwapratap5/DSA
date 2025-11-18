package Package1;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        PrefixSum.find(arr,0,3);
    }

    private static void find(int[] arr, int i, int j) {
        for(int k=1;k<arr.length;k++){
            arr[k]=arr[k-1]+arr[k];
        }
        int sum;
        if (i == 0)
            sum = arr[j];
        else
            sum = arr[j] - arr[i - 1];
        System.out.println(sum);
    }
}
