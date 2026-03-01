public class GetMaximumEvenSum {
    public static void main(String[] args) {
        GetMaximumEvenSum obj = new GetMaximumEvenSum();
        System.out.println(obj.getMaximumEvenSum(new int[]{5,7,9}));
    }

    public int getMaximumEvenSum(int[] arr) {
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        if(sum%2==0){
            return sum;
        }else{
            int minOdd=Integer.MAX_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i]%2!=0 && arr[i]<minOdd){
                    minOdd=arr[i];
                }
            }
            return sum-minOdd;

        }
    }
}
