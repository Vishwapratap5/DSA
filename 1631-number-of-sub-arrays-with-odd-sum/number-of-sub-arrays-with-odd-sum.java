class Solution {
  long MOD = 1_000_000_007;


    public int numOfSubarrays(int[] arr) {
        int start=0;
        int n=arr.length;
        long count=0;
        int sum=0;
        int evenCount=1;
        int oddCount=0;
        

        for(int end=0;end<n;end++){
            sum+=arr[end];

            if(sum%2!=0){
                count+=evenCount;
                oddCount++;
            }else{
                 count+=oddCount;
                evenCount++;
            }
           
        }
        return (int) ((count % MOD + MOD) % MOD);
    }
}