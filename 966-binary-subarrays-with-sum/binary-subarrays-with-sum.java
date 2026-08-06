class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        if(goal < 0)
            return 0;

        return atMostSum(nums,goal)-atMostSum(nums,goal-1);

    }

    public int atMostSum(int[] nums, int goal) {
        if(goal < 0) return 0;
        int start=0;
        int n=nums.length;
        int sum=0;
        int count=0;
        for(int end=0;end<n;end++){
            
            sum+=nums[end];

            while(sum>goal){
                sum-=nums[start];
                start++;
            }
            count+=end-start+1;
        }
        return count;
    }
}