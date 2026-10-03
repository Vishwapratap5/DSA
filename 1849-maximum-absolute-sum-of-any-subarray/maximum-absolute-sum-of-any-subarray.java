class Solution {
    public int maxAbsoluteSum(int[] arr) {
       int v1= maxSum(arr);
       int v2=minSum(arr);
       return Math.max(v1,Math.abs(v2));
    }

    public int maxSum(int[] arr){
        int currentBest=arr[0];
        int best=arr[0];
        int n=arr.length;

        for(int  i=1;i<n;i++){
            int v1=arr[i];
            int v2=currentBest+arr[i];

            currentBest=Math.max(v1,v2);
            best=Math.max(best,currentBest);
        }
        return best;
    }

    public int minSum(int[] arr){
        int currentBest=arr[0];
        int best=arr[0];
        int n=arr.length;

        for(int  i=1;i<n;i++){
            int v1=arr[i];
            int v2=currentBest+arr[i];

            currentBest=Math.min(v1,v2);
            best=Math.min(best,currentBest);
        }
        return best;
    }
}