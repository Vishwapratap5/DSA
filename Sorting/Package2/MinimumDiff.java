import java.util.Arrays;

public class MinimumDiff {
    public static void main(String[] args) {
        int[] arr={5,6,2,3,8,7,24,1};
        System.out.println(MinimumDiff.find(arr));
    }

    private static int find(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int minDiff = Integer.MAX_VALUE;

        for(int i=arr.length-1; i>=1; i--) {
            if(arr[i]-arr[i-1] < minDiff) {
                minDiff = arr[i]-arr[i-1];
            }
        }
        return minDiff;
    }
}
