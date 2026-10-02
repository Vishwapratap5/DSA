class Solution {
    public int maxProduct(int[] arr) {
        int best=arr[0];
        int minBest=arr[0];
        int maxBest=arr[0];
        int n=arr.length;
        int currentBest=arr[0];

        for(int i=1;i<n;i++){
            int v1=minBest*arr[i];
            int v2=maxBest*arr[i];
            int v3=arr[i];

            minBest=Math.min(v1,Math.min(v3,v2));
            maxBest=Math.max(v1,Math.max(v3,v2));
            best=Math.max(best,Math.max(minBest,maxBest));

        }
        return best;
    }
}