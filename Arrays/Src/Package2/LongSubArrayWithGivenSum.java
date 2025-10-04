package Package2;
public class LongSubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr={4,5};
        int sum=5;
        LongSubArrayWithGivenSum.findSubArray(arr,sum);
    }

    private static void findSubArray(int[] arr, int sum) {
        int start=0;
        int CurrentSum=0;
        int end=0;
        int n=arr.length;
        int Maxlen=Integer.MIN_VALUE;
        while(end<n){
            CurrentSum+=arr[end];
            if(CurrentSum==sum){
                Maxlen=Math.max(Maxlen,(end-start+1));
                end++;
            }else if(CurrentSum<sum){
                end++;
            }else{
                CurrentSum-=arr[start];
                start++;
            }
        }
        System.out.println(Maxlen);
    }
}
