class Solution {
    public int maxSubArray(int[] arr) {
        int current=arr[0];
        int best=arr[0];
        int n=arr.length;

        for(int i=1;i<n;i++){
            current=Math.max(arr[i],arr[i]+current);
            best=Math.max(best,current);
        }
        return best;
    }
}