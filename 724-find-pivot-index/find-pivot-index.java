class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int[] prefix=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=nums[i]+prefix[i-1];
        }
        int lSum=0;
        int rSum=0;
        int total=prefix[n-1];

        for(int i=0;i<n;i++){
            lSum=(i==0)?0:prefix[i-1];
            rSum=total-prefix[i];

            if(lSum==rSum){
                return i;
            }
        }
        return -1;
    }
}