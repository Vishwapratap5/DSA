package Package2;

public class MaxSubArraySumKadaneAlgo {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int sum = arr[0];
        int maxSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            sum=Math.max(arr[i],sum);
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        System.out.println(maxSum);
    }
}
