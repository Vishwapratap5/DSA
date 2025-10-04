package Package2;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr={5,7,22,9,3,9};
        int sum=31;
        System.out.println(SubArrayWithGivenSum.isPresent(arr,sum));
    }

    private static boolean isPresent(int[] arr, int sum) {
        int start=0;
        int end=0;
        int n=arr.length;
        int currentSum=0;
//      boolean present=false;
        for(int i=0;i<n;i++){
            currentSum+=arr[end];
            if(currentSum>sum && start<=end){
                currentSum-=arr[start];
                start++;

            }else if(currentSum==sum){
                return true;
            }
        }
        return false;
    }
}
