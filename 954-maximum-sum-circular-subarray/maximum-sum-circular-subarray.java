class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum=0;
        for(int x:nums){
            sum+=x;
        }
        int v1=maxSum(nums);
        if(v1 < 0){
            return v1;
        }
        int v2=minSum(nums);
        return Math.max(v1,sum-v2);
      
    }

    public int maxSum(int[] arr){
        int best=arr[0];
        int currBest=arr[0];
        int n=arr.length;

        for(int i=1;i<n;i++){
            int v1=arr[i];
            int v2=currBest+arr[i];
            currBest=Math.max(v1,v2);
            best=Math.max(best,currBest);
        }
        return best;
    }

    public int minSum(int[] arr){
    int best = arr[0];
    int currBest = arr[0];
    int n = arr.length;

    for(int i = 1; i < n; i++){
        int v1 = arr[i];
        int v2 = currBest + arr[i];

        currBest = Math.min(v1, v2);
        best = Math.min(best, currBest);
    }

    return best;
}
}