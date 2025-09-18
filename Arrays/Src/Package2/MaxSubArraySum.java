package Package2;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr={1,-2,3,-1,2};
        int sum=0;
        int maxSum=0;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum>maxSum){
                    maxSum=sum;
                }
            }
        }
        System.out.println(maxSum);
    }
}
