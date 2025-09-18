package Package2;

public class MaxCircularSumSubArray {
    public static void main(String[] args) {
        int[] arr={1,-2,5,3,7,6,9,-2};
        int sum=0;
        int maxSum=0;
        int i=1;
        int j=0;
       while(i%(arr.length)!=0){
            sum+=arr[i-1];
            sum=Math.max(arr[i-1],sum);
            maxSum=Math.max(maxSum,sum);
            i++;
        }
        System.out.println(maxSum);
    }
}
