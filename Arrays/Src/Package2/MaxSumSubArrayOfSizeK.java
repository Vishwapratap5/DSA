package Package2;

public class MaxSumSubArrayOfSizeK {
    public static void main(String[] args) {
        int[] arr={25,3,2,4,6,9};
        int k=3;
        MaxSumSubArrayOfSizeK.findMaxSumSubArray(arr,k);
    }

    private static void findMaxSumSubArray(int[] arr, int k) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        int start=0;
        int end=0;
        int n=arr.length;

        while(end<n){
            sum+=arr[end];
            if(end-start+1<k){
                end++;
            }else if(end-start+1==k){
                max=Math.max(max,sum);
                sum-=arr[start];
                start++;
                end++;
            }
        }
        System.out.println(max);
    }
}
