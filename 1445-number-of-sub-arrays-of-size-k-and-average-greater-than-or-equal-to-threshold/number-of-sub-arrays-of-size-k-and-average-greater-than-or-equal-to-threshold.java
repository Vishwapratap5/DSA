class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int start=0;
        int end=0;
        int n=arr.length;
        int sum=0;
        int count=0;
        while(end<n){
            sum+=arr[end];

            if(end-start+1<k){
                end++;
            }else if(end-start+1==k){
               int avg=sum/k;
                if(avg>=threshold){
                    count++;
                }
                sum-=arr[start];
                start++;
                end++;
            }
        }
        return count;
    }
}