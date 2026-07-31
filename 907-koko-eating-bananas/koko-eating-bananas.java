class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start=0;
        int n=piles.length;
        int end=0;
        for(int x:piles){
            end=Math.max(end,x);
        }
        int min=Integer.MAX_VALUE;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isPossible(piles,h,mid)){
                end=mid-1;
                min=Math.min(min,mid);
            }else{
                start=mid+1;
            }
        }
        return min;
    }

    public boolean isPossible(int[] arr,int h,int mid){
        double hours=0;

        for(int i=0;i<arr.length;i++){
            hours+=(int)Math.ceil((double)arr[i]/(double)mid);
        }
        return hours<=h;
    }
}