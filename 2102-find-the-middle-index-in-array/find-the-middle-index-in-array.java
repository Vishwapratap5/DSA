class Solution {
    public int findMiddleIndex(int[] nums) {
        int leftSum=0;
        int rightSum=0;
        int total=0;
        if(nums.length==1){
            return 0;
        }
        for(int x:nums){
            total+=x;
        }

        for(int i=0;i<nums.length;i++){
          
            rightSum=total-leftSum-nums[i];

            if(leftSum==rightSum){
                return i;
            }
            leftSum+=nums[i];
        }
        return -1;
    }
}