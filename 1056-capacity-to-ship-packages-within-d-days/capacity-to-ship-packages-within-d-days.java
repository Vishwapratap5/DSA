class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start=0;
        int n=weights.length;
        int end=0;
        for(int x:weights){
            start=Math.max(start,x);
            end+=x;
        }
        int min=Integer.MAX_VALUE;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(isPossible(weights,days,mid)){
                end=mid-1;
                min=Math.min(min,mid);
            }else{
                start=mid+1;
            }
        }
        return min;
    }

    public boolean isPossible(int[] arr,int d,int mid){
        int dayCount=1;
        int capacity=0;
        for(int i=0;i<arr.length;i++){

                if(capacity + arr[i]<=mid){
                    capacity+=arr[i];
                }else{
                    dayCount++;
                    capacity=arr[i];
                }
        }
        return dayCount<=d;
    }
}