class Solution {
    public boolean carPooling(int[][] trips, int capacity) {

        int n=trips.length;
        int max=0;

        for(int i=0;i<n;i++){
            max=Math.max(trips[i][2],max);
        }
        int[] diff=new int[max+1];
        for(int i=0;i<n;i++){
            int l=trips[i][1];
            int r=trips[i][2];
            int x=trips[i][0];

            diff[l]+=x;
            diff[r]-=x;
        }
        int current=0;
        int[] res=new int[max];

        for(int i=0;i<max;i++){
            current+=diff[i];
            res[i]+=current;

            if(res[i]>capacity){
                return false;
            }
        } 
        return true;

    }
}