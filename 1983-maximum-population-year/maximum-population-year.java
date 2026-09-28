class Solution {
    public int maximumPopulation(int[][] logs) {
        int max=0;
        int min=Integer.MAX_VALUE;
        int n=logs.length;

        for(int i=0;i<n;i++){
            max=Math.max(logs[i][1],max);
            min=Math.min(logs[i][0],min);
        }
        int len=max-min;
        int[] diff=new int[len+1];

        for(int i=0;i<n;i++){
            int l=logs[i][0]-min;
            int r=logs[i][1]-min;

            diff[l]+=1;
            diff[r]-=1;
        }
        int[] prefix=new int[len];
        prefix[0]=diff[0];
        int maxPop=0;

        for(int i=1;i<len;i++){
            prefix[i]=prefix[i-1]+diff[i];
        }
        int res=0;
        for(int i=0;i<len;i++){
            if(maxPop<prefix[i]){
                maxPop=prefix[i];
                res=i;
            }
        }
        return res+min;
    }
}